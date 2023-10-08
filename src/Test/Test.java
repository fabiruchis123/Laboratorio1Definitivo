package Test;

import Controller.Controller;
import Dao.Dao;
import Persons.Controller.UserController;
import Persons.Daos.UserDaoList;
import Persons.User;
import Views.PersonView.UserFrmView;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dao userDao = new UserDaoList();
       
       UserFrmView userView = new UserFrmView();
       userView.setVisible(true);
       
       Controller userController = new UserController(userView, userDao);
       
       User user1 = new User("1","David","dd", "123");
       User user2 = new User("2","Felipe","ff", "xyz");
       User user3 = new User("1","Maria","mm", "456");
       
       userController.create(user1);
       userController.create(user2);
       userController.create(user3);
       
       userController.read("2");
    }
    
}
