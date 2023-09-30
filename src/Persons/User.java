package Persons;

public class User extends Person{
    private String userName;
    private int    password;

    public User( String id, String name,String userName, String password) {
        super(id, name);
        this.userName = userName;
        this.password = this.encrypt(password);
    }
    
    public User( String id, String name,String userName, int password) {
        super(id, name);
        this.userName = userName;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    
    private int encrypt(String password){
    return password.hashCode();
    }
 
}
