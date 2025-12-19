package auth;
import model.User;

public class UserSession {
    public static User currentUser;

    //getters and setters

    public User getCurrentUser(){
        return currentUser;
    }

    public void setCurrentUser(User user){
    }
}

