package program1;
import java.util.ArrayList;


public class Student extends Person {
    
    Admin admin = new Admin();
    //Person p = new Person();
    ArrayList<String> Std = new ArrayList<>(50);
    
    int Grade;
    double GPA;
    
    
            
    
     ArrayList<String> StudentNames = new ArrayList<>(100);
     ArrayList<String> StudentAges = new ArrayList<>(100);
     ArrayList<String> StudentPhone = new ArrayList<>(100);
     ArrayList<Double> StudentGPA = new ArrayList<>(100);
    
    public Student(String Name,String Age,String Phone,String Address,String Subject,int Grade,double GPA){
        super(Name,Age,Phone,Address,Subject);
    StudentNames.add("Adham Medhat");     // Filled ArrayList of Names
    StudentNames.add("Ahmed Sadek");
    StudentNames.add("Ahmed Osama");
    StudentNames.add("Ahmed Ibrahim"); 
    
    StudentAges.add("19");                // Filled ArrayList of Ages
    StudentAges.add("20");
    StudentAges.add("22");
    StudentAges.add("21");
    
    StudentPhone.add("01100799540");        // Filled ArrayList of Phone Numbers
    StudentPhone.add("01245464546");
    StudentPhone.add("01523534655");
    StudentPhone.add("01022456485");
    
    StudentGPA.add(4.0);                    //Filled ArrayList of GPA
    StudentGPA.add(4.0);
    StudentGPA.add(4.0);
    StudentGPA.add(4.0);
    
    }
    
    
    
    
    
    @Override
    public void getUser(String a){
    UserList.add(a);
    }
    
    @Override
    public void getPass(String a){
    PassList.add(a);
    }
    
//    @Override
//    public void Display()
//    {
//        super.Display();
//        for(int i=0;i<StudentNames.size();i++)
//            {
//                System.out.println(
//                        "Student No."+(i+1)+
//                        "\tName: "+StudentNames.get(i)+
//                        "\tAge: "+StudentAges.get(i)+
//                        "\tPhone: "+StudentPhone.get(i)+
//                        "\tGPA: "+StudentGPA.get(i));
//            }
//    }
}
