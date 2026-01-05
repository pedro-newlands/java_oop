package auth;
import model.User;

public class AuthenticationService implements LoginService{
    private User currentUser;

    @Override
    public Boolean login(String username, String password){
        return true;
    }

    @Override
    public void logout(){
        System.out.println("saindo");
    }

    @Override
    public User getCurrentUser(){
        return currentUser;
    } 
    
}

