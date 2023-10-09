package Views.personView;

import Persons.User;
import Views.View;


public class UserConsoleView implements View<User> {

    @Override
    public void display(User user) {
        System.out.println("Id:"+user.getId()); 
        System.out.println("Name:"+user.getName()); 
        System.out.println("User Name:"+user.getUserName());
    }

    @Override
    public void displayMessage(String msg) {
        
        System.out.println(msg);
    }
    
}
