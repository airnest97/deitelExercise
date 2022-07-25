package phonebook;

public class Contacts {

    private String name;
    private String phoneNumber;
    private String address;
    private String email;

    public Contacts(String name, String phoneNumber, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return String.format("""
          |===================================================================|
          |      Name:                   %s
          |      Phone Number:           %s
          |      Address:                %s
          |      Email:                  %s
          |===================================================================|
                
                """, getName(), getPhoneNumber(), getAddress(), getEmail());
    }
}
