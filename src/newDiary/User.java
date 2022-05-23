package newDiary;


import java.util.ArrayList;

public class User {
    private ArrayList<NewDiary>users;

    public User() {
        users = new ArrayList<>();
    }

    public NewDiary signUp(String newUserName, String newPassword){
        return new NewDiary(newUserName, newPassword);
    }

}
