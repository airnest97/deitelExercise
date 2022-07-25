package phonebook;

import java.util.ArrayList;

public class PhoneBook {

    private ArrayList<Contacts> phonebook;
    private int numberOfContacts;

    public PhoneBook() {
        phonebook = new ArrayList<>();
    }

    public Contacts createContact(String name, String phoneNumber, String address, String email){
        return new Contacts(name, phoneNumber, address, email);
    }

    public void addContact(Contacts contacts){
        phonebook.add(contacts);
        numberOfContacts++;
    }

    public int getNumberOfContacts(){
        return numberOfContacts;
    }

    public void viewAllEntry(){
        for (Contacts contacts : phonebook) {
            System.out.println(contacts);
        }
    }

    public String findById(int contactId){
        int index = contactId - 1;
        for (int i = 0; i < phonebook.size(); i++) {
            Contacts contacts = phonebook.get(i);
            if (index == i) {
                return contacts.toString();
            }
        }
        return "Contact not found";
    }
}
