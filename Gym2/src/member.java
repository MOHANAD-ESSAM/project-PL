import javax.management.relation.Role;
import java.io.*;
import java.time.LocalDate;
import java.util.function.DoubleToIntFunction;

public  class member extends User {
    private LocalDate date;

    public member() {
    }
    public LocalDate getDate(){
        date=LocalDate.now();
        return date;
    }
    public LocalDate getEndDate(){
        return LocalDate.now().plusMonths(5);
    }

    public member(String username, String password, int age, int roleid) {
        super(username, password, age, roleid);
    }


    @Override
    public boolean signIn(String username, String password) {


                try {
            BufferedReader reader = new BufferedReader(new FileReader("Members.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Username: " +username) && line.contains("Password: " + password)) {


                        System.out.println("Sign in is scucced");


                    reader.close();

                this.AllDatils();

                    return true;
                }

            }
        } catch (IOException e) {
            System.out.println("your user name is un correct");
            e.printStackTrace();
            System.out.println("Your User name or password Incorrect");
        }
        return false;


    }

@Override
    public void AllDatils(){
super.AllDatils();
    System.out.print(getDate()+" "+getEndDate());


}

}
