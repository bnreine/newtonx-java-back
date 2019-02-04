public class UserController {
  //2 variables to track
  int nextId = 3;
  UserStore userStore;

  //constructor that receives user store instance
  public UserController(UserStore user_Store){
    userStore = user_Store;
  }

  //creates new user in user store and returns it
  public User createUser(String fName, String lName){
    User nextUser = new User(fName, lName, nextId);
    userStore.users.put(nextId, nextUser);
    User returnedUser = new User(fName, lName, nextId);
    nextId++;
    return returnedUser;
  }

  //fetches user by id and returns it
  public User fetchUser(int id){
    return userStore.users.get(id);
  }

  //fetches all users and returns them
  public User[] fetchAllUsers(){
    User[] allUsers = new User[userStore.users.size()];
    int index = 0;
    for(int id : userStore.users.keySet()) {
      allUsers[index] = userStore.users.get(id);
      index++;
    }
    return allUsers;
  }


}
