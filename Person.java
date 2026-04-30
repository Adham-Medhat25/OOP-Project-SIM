package program1;
import java.util.ArrayList;

public class Person {
    ArrayList<String> UserList = new ArrayList<>(100);
    ArrayList<String> PassList = new ArrayList<>(100);
    
    String Name;
    String Pass;
    String Phone;
    
    public Person(){
        this.Name=Name;
        this.Pass=Pass;
        this.Phone=Phone;
    }
    
    public void getUser(String a){
    UserList.add(a);
    }
    
    public void getPass(String a){
    PassList.add(a);
    }
}
