package program1;
import java.util.ArrayList;

public class Admin extends Person {
    private String User;
    private String Pass;
    
    ArrayList<String> admin = new ArrayList<>(100);
    
    public Admin (){
    
    }
    
    public Admin(String User,String Pass){
        this.User=User;
        this.Pass=Pass;
    }
    
    public void getAdmin(String a){
    admin.add(a);
    }
    
    public void getPassword(String a){
    admin.add(a);
    }
}
