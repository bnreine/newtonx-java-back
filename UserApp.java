public class UserApp {
  public static void main(String[] args){

    //Initialize user store
    UserStore userStore = new UserStore();

    //Initialize user controller and pass it the user store instance
    UserController userController = new UserController(userStore);

    //create 2 new users
    String fNameA = "Bob";
    String lNameA = "Jones";
    User userA = userController.createUser(fNameA, lNameA);
    String fNameB = "Sarah";
    String lNameB = "Roberts";
    User userB = userController.createUser(fNameB, lNameB);

    //fetch a user by their id
    int fetchedUserId = 2;
    User fetchedUser = userController.fetchUser(fetchedUserId);

    //fetch all users
    User[] allUsers = userController.fetchAllUsers();
    
  }
}
