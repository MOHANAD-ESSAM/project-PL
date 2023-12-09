import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Coach extends User {
    public Coach() {
    }

    public Coach(String username, String password, int age, int roleid) {
        super(username, password, age, roleid);
    }

    @Override
    public boolean signIn(String username, String password) {


        try {
            BufferedReader reader = new BufferedReader(new FileReader("Coachs.txt"));
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


}
