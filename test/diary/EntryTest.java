package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {

    private Entry entry;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mm:ss a");
    public String date = dateTimeFormatter.format(LocalDateTime.now());
    @BeforeEach
    public void startsWith () {
        entry = new Entry("Dear diary", "We move");
    }

    @Test
    public void entryCanBeCreated(){
        assertNotNull(entry);
    }

    @Test
    public void entryCanBeCreatedWithDetails(){
        assertEquals("Dear diary", entry.getTitle());
    }

    @Test
    public void entryCanHaveBody(){
        assertEquals("We move", entry.getBody());
    }

    @Test
    public void entryCanHaveDateAndTime(){
        assertEquals(date, entry.getDate());
    }
}
