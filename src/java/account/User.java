
package account;

import java.io.Serializable;

public class User implements Serializable
{
    private String userN;
    private String pass;
    
    public User() 
    {
        
    }

    public User(String userN, String pass) 
    {
        this.userN = userN;
        this.pass = pass;
    }
    
    public String getUserN() 
    {
        return userN;
    }

    public void setUserN(String userN) 
    {
        this.userN = userN;
    }

    public String getPass() 
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass = pass;
    }   
}
