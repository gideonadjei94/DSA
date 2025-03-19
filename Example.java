import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Example {


    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
            users.add(new User("1", "Kwaku Manu", "something@gmail.com", "1234"));
            users.add(new User("2", "Kwame Tugba", "something1@gmail.com", "12345"));
            users.add(new User("3", "Kw3 Kekeli", "something2@gmail.com", "12345"));
            users.add(new User("4", "John Doe", "something3@gmail.com", "12345"));
             users.add(new User("5", "Joana Doe", "something4@gmail.com", "12345"));

             for(User i : users){
                 System.out.println(i);
             }

        }

}

    class User {
    String id;
    String name;
    String email;
    String password;

    public User(String id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

        @Override
        public String toString() {
            return "User{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }