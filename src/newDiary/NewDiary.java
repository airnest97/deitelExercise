package newDiary;

import java.util.ArrayList;
import java.util.Objects;

public class NewDiary {
    private String diaryName;
    private String password;
    private final ArrayList<NewEntry> newEntries;
    private int numberOfEntries;
    private boolean isLocked;

    public NewDiary(String diaryName, String password) {
        this.diaryName = diaryName;
        this.password = password;
        newEntries = new ArrayList<>();
    }

    public void locked(){
        isLocked = true;
    }

    public void unlocked(String password){
        if (isPasswordValid(password)){
            isLocked = false;
        }
    }

    public boolean lockedStatus() {
        return isLocked;
    }
    NewEntry newEntry = new NewEntry("Dear diary", "Java wahala");

    public String getEntryTitle() {
        return newEntry.getTitle();
    }

    public String getEntryBody() {
        return newEntry.getBody();
    }

    public String getEntryDate() {
        return newEntry.getDate();
    }

    public void setDiaryName(String diaryName) {
        this.diaryName = diaryName;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public String getDiaryName() {
        return diaryName;
    }

    public boolean isPasswordValid(String password) {
        return Objects.equals(this.password, password);
    }

    public NewEntry createEntry(String title, String body) {
        return new NewEntry(title, body);
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public void addEntry(NewEntry entry) {
        newEntries.add(entry);
        numberOfEntries += 1;
    }

    public String findEntryByTitle(String entryTitle) {
            for (NewEntry entry : newEntries) {
                if (entry.getTitle().equalsIgnoreCase(entryTitle)) {
                    return entry.toString();
                }
            }
            return "Not found";
    }

    public void removeEntry(String entryTitle, String password) {
            for (int i = 0; i < newEntries.size(); i++) {
                NewEntry entry = newEntries.get(i);
                if (entry.getTitle().equalsIgnoreCase(entryTitle) && isPasswordValid(password)) {
                    newEntries.remove(entry);
                    numberOfEntries -= 1;
                }
            }
    }

    public String findEntryById(int entryId) {
        int index = entryId - 1;
        for (int i = 0; i < newEntries.size(); i++) {
            NewEntry entry = newEntries.get(i);
            if (index == i)
                return entry.toString();
        }
        return "Entry " + entryId + " not found";
    }

    public void removeById(int entryId, String password) {
        int index = entryId - 1;
        for (int i = 0; i < newEntries.size(); i++) {
            NewEntry entry = newEntries.get(i);
            if (i == index && isPasswordValid(password)) {
                newEntries.remove(entry);
                numberOfEntries -= 1;
            }
        }
    }

    public boolean editEntryByTitle(String entryTitle, String password, String newTitle, String newBody) {
        for (int i = 0; i < newEntries.size(); i++) {
            NewEntry entry = newEntries.get(i);
            if (entry.getTitle().equalsIgnoreCase(entryTitle) && isPasswordValid(password)) {
                newEntries.set(i, new NewEntry(newTitle, newBody));
                return true;
            }
        }
        return false;
    }

    public boolean editEntryById(int entryId, String password, String newTitle, String newBody) {
        int index = entryId - 1;
        for (int i = 0; i < newEntries.size(); i++) {
            if (i == index && isPasswordValid(password)){
                newEntries.set(i, new NewEntry(newTitle, newBody));
                return  true;
            }
        }
        return false;
    }

    public void viewAllEntry() {
        for (NewEntry entry : newEntries) {
            System.out.println(entry);
        }
    }

    public boolean isUsernameValid(String username){
        return getDiaryName().equalsIgnoreCase(username);
    }
}
