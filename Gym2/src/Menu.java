import java.util.*;

public class Menu {


    public Menu() {
    }



    public static   void Main() {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Hello are you ");
        System.out.println("Welcom to our Gym");
        System.out.println("1- Sign up  2-Sign in");
        x = input.nextInt();


        if (x == 1) {

            Menu.SignupMenu();
        }
        else {
            if(x==2){
                Menu.SigninMenu();
            }
            else
                System.out.println("Erro chose from opthion");
        }
    }


    public  static void SigninMenu(){


     System.out.println("1-Sign as Admin");
     System.out.println("2-Sign as Coach");
     System.out.println("3-Sign as Member");



 }

 public static void SignupMenu(){


     System.out.println("Username: ");
     System.out.println("password: ");
     System.out.println("Age: ");
     System.out.println("Role:[1-Admin,2-coach,3-Member] ");



 }










}
