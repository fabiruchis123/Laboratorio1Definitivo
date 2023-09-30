package Persons.Dtos;


public class UserDto extends PersonDto {
     private String userName;
    private int    password;

    public UserDto(String name, String id, String userName, int password) {
        super(id, name);
        this.userName = userName;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
