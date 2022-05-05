package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;

    @BeforeEach
    public void startsWith(){
        diary = new Diary("Ernest", "1234");
    }

    @Test
    public void diaryCanBeCreatedTest(){
        assertNotNull(diary);
    }

    @Test
    public void diaryCanHaveANameTest(){
        assertEquals("Ernest", diary.getDiaryName());
    }

    @Test
    public void diaryCanHaveAPasswordTest(){
        assertTrue(diary.isPasswordValid("1234"));
    }

    @Test
    public void entryCanBeCreatedInDiaryTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void multipleEntriesCanBeCreatedTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());
    }

    @Test
    public void entryCanBeFoundByTitleTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        String findEntry = diary.findEntryByTitle("Loki");

        assertEquals("Sun, 01:05:2022, 04:26:22 PM || Loki || Hellboy", findEntry);
    }

    @Test
    public void entryCanBeDeletedByTitleTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hell boy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        diary.removeEntry("Loki", "1234");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void multipleEntriesCanBeRemovedTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear mama", "Thank you");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        diary.removeEntry("Loki", "1234");
        diary.removeEntry("Dear mama", "1234");

        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void entryCanBeFoundByIdTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear mama", "Thank you");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        String findEntryById = diary.findEntryById(3);
        assertEquals("Mon, 02:05:2022, 01:36:45 PM || Loki || Hellboy", findEntryById);
    }

    @Test
    public void entryCanBeDeletedByIdTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear mama", "Thank you");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        assertTrue(diary.removeById(3, "1234"));
        diary.removeById(2, "1234");

        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void editEntryInDiaryByTitleTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear mama", "Thank you");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        assertTrue(diary.editEntryByTitle("Loki", "1234", "Polite", "Atomic"));

    }

    @Test
    void editEntryInDiaryByIdTest(){
        Entry entry = diary.createEntry("Dear diary", "We move");
        diary.addEntry(entry);

        Entry entry1 = diary.createEntry("Dear mama", "Thank you");
        diary.addEntry(entry1);

        Entry entry2 = diary.createEntry("Loki", "Hellboy");
        diary.addEntry(entry2);
        assertEquals(3, diary.getNumberOfEntries());

        assertTrue(diary.editEntryById(3, "1234", "Toilet", "Very bad girl"));
    }
}