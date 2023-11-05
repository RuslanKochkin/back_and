package lesson9;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
Создали таблицу

CREATE TABLE event (
id SERIAL PRIMARY KEY,
name TEXT NOT NULL
);
insert into event (name, city) values ('Jazz Concert', 'Berlin');

https://stackoverflow.com/questions/2944297/postgresql-function-for-last-inserted-id
 */
public class EventDAO {
    private final DataSource dataSource;

    public EventDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Event remove (Integer id) throws SQLException {
        Event event = null;
        //подключение к базе
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM event WHERE id = ?  IS TRUE RETURNING *");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                event = new Event(rs.getInt("id"), rs.getString("name"), rs.getString("city"));
            }
        }
        return event;
    }

public Event save (Event event) throws SQLException {
    PreparedStatement ps;
        try (Connection connection = dataSource.getConnection()) {
            if (event.getId() == null) {
            ps = connection.prepareStatement("insert into event (name, city) values (?, ?) RETURNING id");
            ps.setString(1, event.getCity());
            ps.setString(2, event.getName());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                event.setId(rs.getInt("id"));
            }
    }else {
            ps = connection.prepareStatement("UPDATE event SET name = ?, city = ? WHERE id = ?");
            ps.setString(1, event.getName());
            ps.setString(2, event.getCity());
            ps.setInt(3, event.getId());

                int rowCount = ps.executeUpdate();
                System.out.println(rowCount);
                // TODO throw if id not exists
    }
}
    return event;
}

    public List<Event> findAll()throws SQLException{
        List<Event> events = new ArrayList<>();
        //подключение к базе
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM event");
            ResultSet rs = ps.executeQuery();
            //получения данных и создание обьекта
            while (rs.next()) {
                events.add(new Event(rs.getInt("id"), rs.getString("name"), rs.getString("city")));
            }
        }
        //возврат записи(валидация обьекта)
        return events;
    }
    public Event findById (Integer id) throws SQLException {


        Event event = null;
        //подключение к базе
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM event WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            //получения данных и создание обьекта
            if (rs.next()) {
                event = new Event(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            if(event == null){
                throw new SQLDataException("Not found record in event table, id=" +id);
            }
        }

        //возврат записи(валидация обьекта)
        return event;
    }
}
