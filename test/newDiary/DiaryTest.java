package newDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private NewDiary newDiary;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mm:ss a");
    public String date = dateTimeFormatter.format(LocalDateTime.now());
    @BeforeEach
    void setUp() {
        newDiary = new NewDiary("Ernest", "1234");
    }

    @Test
    void diaryCanBeCreatedTest(){
        assertNotNull(newDiary);
    }

    @Test
    void diaryCanHaveTitleOfEntryTest(){
        String hasEntry = newDiary.getEntryTitle();
        assertEquals("Dear diary", hasEntry);
    }

    @Test
    void diaryCanHaveBodyOfEntryTest(){
        String hasEntryWithBody = newDiary.getEntryBody();
        assertEquals("Java wahala", hasEntryWithBody);
    }

    @Test
    void diaryCanHaveDateAndTimeOfEntryTest(){
        String hasEntryWithDateAndTime = newDiary.getEntryDate();
        assertEquals(date, hasEntryWithDateAndTime);
    }

    @Test
    void diaryCanHaveA_NameTest(){
        assertEquals("Ernest", newDiary.getDiaryName());
    }

    @Test
    void diaryCanHaveA_PasswordTest(){
        assertTrue(newDiary.isPasswordValid("1234"));
    }

    @Test
    void diaryCanHaveEntryTest(){
        NewEntry entry = newDiary.createEntry("dear mama", "be blessed");
        newDiary.addEntry(entry);
        assertEquals(1, newDiary.getNumberOfEntries());
    }

    @Test
    void diaryCanHaveMultipleEntriesTest(){
        NewEntry entry = newDiary.createEntry("dear mama", "be blessed");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("so fine", "loved");
        newDiary.addEntry(entry1);

        assertEquals(2, newDiary.getNumberOfEntries());
    }

    @Test
    void entryCanBeFoundByTitleTest(){
        NewEntry entry = newDiary.createEntry("dear mama", "be blessed");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("so fine", "loved");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        String findEntry = newDiary.findEntryByTitle("Loki");
//        assertEquals("wds", findEntry);
    }

    @Test
    void entryCanBeDeletedByTitleTest(){
        NewEntry entry = newDiary.createEntry("dear mama", "be blessed");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("so fine", "loved");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        newDiary.removeEntry("Loki", "1234");
        assertEquals(2,newDiary.getNumberOfEntries());
    }

    @Test
    void multipleEntriesCanBeDeletedTest(){
        NewEntry entry = newDiary.createEntry("Dear diary", "We move");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("Dear mama", "Thank you");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        newDiary.removeEntry("Loki", "1234");
        newDiary.removeEntry("Dear mama", "1234");
    }

    @Test
    void entryCanBeFoundByIdTest(){
        NewEntry entry = newDiary.createEntry("Dear diary", "We move");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("Dear mama", "Thank you");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        String findEntryById = newDiary.findEntryById(3);
        assertEquals("sss", findEntryById);
    }

    @Test
    void entryCanBeDeletedByIdTest(){
        NewEntry entry = newDiary.createEntry("Dear diary", "We move");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("Dear mama", "Thank you");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        newDiary.removeById(3, "1234");
        newDiary.removeById(1, "1234");
        assertEquals(1, newDiary.getNumberOfEntries());
    }

    @Test
    void editEntryInDiaryByTitleTest(){
        NewEntry entry = newDiary.createEntry("Dear diary", "We move");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("Dear mama", "Thank you");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        boolean editedEntry = newDiary.editEntryByTitle("Loki", "1234", "Polite", "Atomic");

        assertTrue(editedEntry);
    }

    @Test
    void editEntryInDiaryByIdTest(){
        NewEntry entry = newDiary.createEntry("Dear diary", "We move");
        newDiary.addEntry(entry);

        NewEntry entry1 = newDiary.createEntry("Dear mama", "Thank you");
        newDiary.addEntry(entry1);

        NewEntry entry2 = newDiary.createEntry("Loki", "Hellboy");
        newDiary.addEntry(entry2);
        assertEquals(3, newDiary.getNumberOfEntries());

        boolean editedEntry = newDiary.editEntryById(3, "1234", "Polite", "Atomic");
        assertTrue(editedEntry);
    }

    @Test
    void diaryCanBeLockedTest(){
        newDiary.locked();
        assertTrue(newDiary.lockedStatus());
    }

    @Test
    void diaryCanBeUnlockedTest(){
        newDiary.locked();
        newDiary.unlocked("1234");
        assertFalse(newDiary.lockedStatus());
    }

    @Test
    void diaryCanBeLockedAfterUnlockingTest() {
        newDiary.locked();
        newDiary.unlocked("1234");
        newDiary.locked();
        assertTrue(newDiary.lockedStatus());
    }
}
