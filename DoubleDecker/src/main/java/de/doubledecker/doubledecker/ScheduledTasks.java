package de.doubledecker.doubledecker;

import de.doubledecker.doubledecker.service.IntervalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduledTasks {

    @Autowired
    private IntervalService intervalService;

    @Scheduled(cron = "0 0 0 * * ?") // Каждая полночь
    public void updateAvailableTickets() {
        int newAvailableTickets = 40;
        intervalService.updateAvailableTicketsForAllIntervals(newAvailableTickets);
    }
}

