import java.util.HashMap;

public class UserStore {
  HashMap<Integer, User> users = new HashMap<Integer, User>();

  //Contructs an initial users in the store
  public UserStore(){
    User user1 = new User("Carrie", "Abrams", 1);
    users.put(1, user1);
    User user2 = new User("Brian", "Filipo", 2);
    users.put(2, user2);
  }

}
