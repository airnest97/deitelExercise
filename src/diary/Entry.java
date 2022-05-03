package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private final String title;
    private final String body;
    private final String date;


    public Entry(String title, String body) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mm:ss a");
        date = dateTimeFormatter.format(LocalDateTime.now());
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getBody() {
        return body;
    }
}
