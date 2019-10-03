package account;

public class AccountService 
{
   public User login(String username, String password)
   {
       if(username.equals("betty") && (password.equals("password")))
       {
            User user = new User(username,password);
            return user;
       }
       else if(username.equals("adam") && (password.equals("password")))
       {
          User user = new User(username,password);
            return user;
       }
       else
       {
           return null;
       }    
   }   
}
