package program1;
import java.util.ArrayList;


public class Student extends Person {
    
    ArrayList<String> Std = new ArrayList<>(50);
            
    double GPA;
    
    public Student(){
        this.Name=Name;
        this.Phone=Phone;
        this.GPA=GPA;
    }
    
    
    public void getStudent(String x){
    Std.add(x);
    }
    
    @Override
    public void getUser(String a){
    UserList.add(a);
    }
}
