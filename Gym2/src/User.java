import javax.management.relation.Role;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;
public  abstract  class User  {

    private String Username;
    private String password;
    private int  Roleid;
    private int Age;
    public static int number_of_users=0;
    private LocalDate date;
    private int id=number_of_users;
    public LocalDate getDate(){
        date=LocalDate.now();
        return date;
    }
    public LocalDate getEndDate(){
        return LocalDate.now().plusMonths(5);
    }

    public User() {
        number_of_users++;
        id=number_of_users;
    }

    public User(String username, String password, int age, int roleid) {

        this.Username = username;
        this.password = password;
        this.Age = age;
        this.Roleid=roleid;
        number_of_users++;
        id=number_of_users;

    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return Age;
    }

    public int getId() {
        return id;
    }

    public void setRoleid(int roleid) {
        this.Roleid = roleid;
    }

    public String getRoleid() {
        String role="";

        if (Roleid==1){
      role="Admin";


        }
        else {
            if(Roleid==2) {
             role="Coach";

            }
            else {
                if(Roleid==3) {
                   role="Member";

                }
            }
        }

return role;
    }


    public void AllDatils() {
        System.out.println( "User{" +"Username='" + Username + '\'' + ", password='" + password + '\'' +", Age=" + Age + ", id=" + id + '}');
    }

    public static int getNumber_of_users() {





        return number_of_users;
    }

    public void signUp() {




        if(this.Roleid==1){
            try {
                PrintWriter writer = new PrintWriter(new FileWriter("Admins.txt", true));
                writer.print("Username: " +getUsername()+"  ");
                writer.print("Password: " + getPassword()+"  ");
                writer.print("Age: " + getAge()+"  ");
                writer.print("Id: " +getId()+"  ");
                writer.println("Role: " +getRoleid()+"  ");

                writer.println();
                writer.close();
                System.out.println("Account information saved to accounts.txt");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }
        else {

            if(this.Roleid==2){
                try {
                    PrintWriter writer = new PrintWriter(new FileWriter("Coachs.txt", true));
                    writer.print("Username: " +getUsername()+"  ");
                    writer.print("Password: " + getPassword()+"  ");
                    writer.print("Age: " + getAge()+"  ");
                    writer.print("Id: " +getId()+"  ");
                    writer.println("Role: " +getRoleid()+"  ");

                    writer.println();
                    writer.close();
                    System.out.println("Account information saved to accounts.txt");
                } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file.");
                    e.printStackTrace();
                }
            }
          if (this.Roleid==3){
              try {
                  PrintWriter writer = new PrintWriter(new FileWriter("Members.txt", true));
                  writer.print("Username: " +getUsername()+"  ");
                  writer.print("Password: " + getPassword()+"  ");
                  writer.print("Age: " + getAge()+"  ");
                  writer.print("Id: " +getId()+"  ");
                  writer.print("Role: " +getRoleid()+"  ");
                  writer.print("Startdata: " +getDate()+"  ");
                  writer.println("EndDate: " +getEndDate()+"  ");

                  writer.println();
                  writer.close();
                  System.out.println("Account information saved to accounts.txt");
              } catch (IOException e) {
                  System.out.println("An error occurred while writing to the file.");
                  e.printStackTrace();
              }
          }

        }


        try {
            PrintWriter writer = new PrintWriter(new FileWriter("accounts.txt", true));
            writer.print("Username: " +getUsername()+"  ");
            writer.print("Password: " +getPassword()+" ");

         writer.print("Age: " + getAge()+"  ");
            writer.print("Username: " +getId()+"  ");
            writer.print("Role: " +getRoleid()+"  ");



            writer.println();
            writer.close();
            System.out.println("Account information saved to accounts.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public abstract   boolean   signIn(String username,String password) ;


  /*      try {
            BufferedReader reader = new BufferedReader(new FileReader("accounts.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Username: " +username) && line.contains("Password: " + password)) {


                        System.out.println("Sign in is scucced");
                    reader.close();
                    return true;
                }

            }
        } catch (IOException e) {
            System.out.println("your user name is un correct");
            e.printStackTrace();
            System.out.println("Your User name or password Incorrect");
        }
        return false;*/

}

