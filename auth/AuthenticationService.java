package auth;
import model.User;

//implementação da interface, uma vez que aqui será dito as regras do negócio
public class AuthenticationService implements LoginService{
    private User currentUser;

    //polimorfismo de sobrescrita nos métodos da interface, pois é crucial que a assinatura permaneca a mesma da proposta por LoginService
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
