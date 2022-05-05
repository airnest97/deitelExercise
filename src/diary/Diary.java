package diary;

import java.util.ArrayList;
import java.util.Objects;

public class Diary {
    private String diaryName;
    private ArrayList<Entry> entries;
    private String password;
    private int numberOfEntries;

    public Diary(String diaryName, String password) {
        this.diaryName = diaryName;
        this.password = password;
        entries = new ArrayList<>();
    }

    public Entry createEntry(String title, String body) {
        return new Entry(title, body);
    }

    public void setDiaryName(String userName) {
        this.diaryName = userName;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getDiaryName() {
        return diaryName;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
        numberOfEntries += 1;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public String findEntryByTitle(String entryTitle) {
        for (Entry entry : entries) {
            if (Objects.equals(entry.getTitle(), entryTitle)) {
                return entry.toString();
            }
        }
        return "Not found";
    }

    public boolean removeEntry(String entryTitle, String password) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (Objects.equals(entry.getTitle(), entryTitle) && (isPasswordValid(password))) {
                entries.remove(entry);
                numberOfEntries -= 1;
                return true;
            }
        }
        return false;
    }

    public String findEntryById(int entryId) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (Objects.equals(index, i)) {
                return entry.toString();
            }
        }
        return "Entry " + entryId + " not found";
    }

    public boolean removeById(int entryId, String password) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (Objects.equals(i, index) &&  (isPasswordValid(password))) {
                entries.remove(entry);
                numberOfEntries -= 1;
                return true;
            }

        }
        return false;
    }

    public void viewAllEntry() {
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }

    public boolean editEntryByTitle(String entryTitle, String password, String newTitle, String newBody) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (Objects.equals(entryTitle, entry.getTitle()) &&  (isPasswordValid(password))) {
                entries.set(i, new Entry(newTitle, newBody));
                return true;
            }
        }
        return false;
    }

    public boolean editEntryById(int entryId, String password, String newTitle, String newBody) {
        int index = entryId - 1;
        for (int i = 0; i < entries.size(); i++) {
            if (Objects.equals(i, index) &&  (isPasswordValid(password))) {
                entries.set(i, new Entry(newTitle, newBody));
                return true;
            }
        }
        return false;
    }

    public boolean isUsernameValid(String username){
        return Objects.equals(username, getDiaryName());
    }

    public boolean isPasswordValid(String password){
        return Objects.equals(password, this.password);
    }
}