import java.util.HashMap;
import java.util.Map;

public class UserDao {
    Map<Integer,User> userDb = new HashMap<Integer, User>();
    {
        userDb.put(genId(),new User("Aaron","1252"));
        userDb.put(genId(),new User("Samuel","1234"));

    }
    public Integer genId(){
        return userDb.size()+1;
    }
    public void addUser(User user){ userDb.put(genId(),user);}
}
