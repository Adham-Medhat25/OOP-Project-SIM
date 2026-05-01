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
        
        Staff StaffObj = new Staff();
        
        Admin ad = new Admin();
         
        SchoolSystem(); // the whole program :)  
        
       
    }
    
        public static void drawLine(int a){
        for(int i=0;i<a;i++){
        System.out.print("* ");
        }
        System.out.print("");
    }
        
        /*     --The Program Code--      */
        
        public static void SchoolSystem(){
        
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
        
        Staff StaffObj = new Staff();
        
        Admin ad = new Admin();
        
        while(true){ // The first while loop
            
        System.out.println("Hello to our program");
        System.out.println("Choose who you are");
        System.out.println("1-Admin\n2-Student\n3-Teacher");
            int detect = console.nextInt();
        
        switch(detect){
            case 1:
                System.out.println("Confirm you are Admin");
                
                    System.out.print("Enter Username : ");
                        console.nextLine();
                            ad.getUser(console.nextLine());
                            
                
                        System.out.print("Enter Password : ");
                            ad.getPass(console.nextLine());
                            
                            System.out.println(ad.UserList);
                                System.out.println(ad.PassList);
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
            System.out.println("Enter The staff name");
            



        boolean validChoice = false;

        while (!validChoice) {
    System.out.println("\nPress 7 to return to the main menu");
    System.out.println("Press 9 to quit");
    
    // Check if the input is actually an integer to avoid crashes
    if (console.hasNextInt()) {
                int fun = console.nextInt();

        if (fun == 9) {
            drawLine(18);
            System.out.println("\nThank you for using this program :)");
            drawLine(18);
            System.exit(0); // Exits the entire program
        } 
        
        else if (fun == 7) {
            drawLine(3);
            System.out.println("\nReturning to Main Menu...");
            drawLine(3);
            validChoice = true; // This breaks this inner loop and hits the 'continue' in the outer loop
        } 
        
        else {
            drawLine(18);
            System.out.println("\nThis is an invalid number!");
            System.out.println("Please try again to enter the valid numbers (7 or 9).");
            drawLine(18);
        }
    } 
    else {
        // If they enter a letter instead of a number
        System.out.println("Invalid input. Please enter a digit (7 or 9).");
        console.next(); // Clear the bad input
    }
        
        }// the inner while loop//
        
        } // {} the  outer while loop
        } // the Progran

} // the class Program1 

