package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.controller.dto.EventDTO;
import spring.domain.Event;
import spring.repository.EventRepository;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public EventDTO add(EventDTO event) {
        Event newEvent = new Event(event.getName(), event.getCity());
        newEvent = eventRepository.save(newEvent);
        return EventDTO.getInstance(newEvent);
    }

    public Event update(Event event) {
        Event updEvent = eventRepository.findById(event.getId()).orElse(null);
        if (updEvent != null) {
            updEvent.setName(event.getName());
            updEvent.setCity(event.getCity());
            return eventRepository.save(updEvent);
        }
        return null;
    }

    public Event delete(Integer eventId) {
        Event delEvent = eventRepository.findById(eventId).orElse(null);
        if (delEvent != null) {
            eventRepository.delete(delEvent);
            return delEvent;
        }
        return null;
    }
}
