//interface para padronização de métodos

package auth;
import model.User;

public interface LoginService{
    Boolean login(String username, String password);
    void logout();
    User getCurrentUser();    
}