package program1;
import java.util.Scanner;
import java.util.ArrayList;


public class Program1 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        String adminUser;
        
        ArrayList<String> log = new ArrayList<>();
        
        DataLogIn h = new DataLogIn();
        
        Student s1 = new Student();
        
        Admin a1 = new Admin();
        
        Person p1 = new Person(); //Obj from kind person to refer person
        
        Person AdminObj = new Admin(); // Obj kind person but refer to admin
        
        Person StdObj = new Student(); // Obj kind person but refer to student
        
        Person TechObj = new Teacher(); // Obj kind person but refer to teacher
        
        while(true){
            
        System.out.println("Hello to our program");
        System.out.println("Choose who you are");
        System.out.println("1-Admin\n2-Student\n3-Teacher");
            int detect = console.nextInt();
        
        switch(detect){
            case 1:
                System.out.println("Confirm you are Admin");
                
                    System.out.print("Enter Username : ");
                        console.nextLine();
                            AdminObj.getUser(console.nextLine());
                            
                
                        System.out.print("Enter Password : ");
                            AdminObj.getPass(console.nextLine());
                            
                            System.out.println(AdminObj.UserList);
                                System.out.println(AdminObj.PassList);
                break;
                
            case 2: 
                System.out.println("Confirm you are Student");
                    
                    System.out.print("Enter Username : ");
                        console.nextLine();
                            StdObj.getUser(console.nextLine());
                            
                            System.out.print("Enter Password : ");
                                StdObj.getPass(console.nextLine());
                                
                                System.out.println(StdObj.UserList);
                                    System.out.println(StdObj.PassList);
                break;
                
            case 3:
                System.out.println("Confirm you are Teacher");
                    
                    System.out.print("Enter Username : ");
                        console.nextLine();
                            TechObj.getUser(console.nextLine());
                            
                            System.out.print("Enter Password : ");
                                TechObj.getPass(console.nextLine());
                                
                                System.out.println(TechObj.UserList);
                                    System.out.println(TechObj.PassList);
                break;
            default:
                drawLine(16);
                System.out.println("\nInvalid Input please try again!");
                drawLine(16);
                System.out.println("");
                continue;
        }

        
        System.out.println("Press 7 to return to the pre-menu\nPress 9 to quit");
        int fun = console.nextInt();
        
        
        
            if(fun ==9){
                drawLine(18);
                    System.out.println("\nThank you for using this program :)");
                drawLine(18);
            break;
        } 
            else if (fun == 7) {
            
                drawLine(3);
                    System.out.println("\nAgain");
                drawLine(3);
                System.out.println("");
            continue;
         }
            else{
                drawLine(18);
                    System.out.println("\nInvalid input, please try again :(");
                drawLine(18);
                    System.out.println("");
            break;
        }
        
        
        } // {} the while loop
            
    }
           

    
    public static void drawLine(int a , char c){
        for(int i=0;i<a;i++){
        System.out.println(c);
        }
        System.out.print("");
    }
    
        public static void drawLine(int a){
        for(int i=0;i<a;i++){
        System.out.print("* ");
        }
        System.out.print("");
    }
        

}
