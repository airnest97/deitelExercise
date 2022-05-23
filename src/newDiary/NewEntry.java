package newDiary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewEntry {
    private final String title;
    private final String body;
    private final LocalDateTime date = LocalDateTime.now();

    public NewEntry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mm:ss a");
        return dateTimeFormatter.format(date);
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString(){
        return String.format("""
                Date:               %s
                
                Title:              %s
                
                Body:               %s
                
                
                ======================================================
                
                """, getDate(), title, body);
    }
}
