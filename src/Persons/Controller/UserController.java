
package Persons.Controller;

import Controller.Controller;
import Dao.Dao;
import Persons.Dtos.UserDto;
import Persons.User;
import Views.View;
import java.util.List;

/**
 *
 * @author David Duarte Garcia
 */
public class UserController implements Controller<User> {
    private View view;
    private Dao dao;

    public UserController(View view, Dao dao) {
        this.view = view;
        this.dao = dao;
    }
    
    

    @Override
    public boolean create(User user) {
        if (dao.read(user.getId()) != null){
            view.displayMessage("El Usuario ya esta registrado");
            return false;
        }else{
            //Validar Integridad 
            UserDto userDto = new UserDto(user.getId(), user.getName(), user.getUserName(), user.getPassword());
            if (dao.create(userDto)){
               view.displayMessage("Se agrego correctamente");
               return true;
            }else{
                view.displayMessage("Error al agregar");
                 return false;
            } 
        }
    }

    @Override
    public User read(String id) {
       UserDto userDto = (UserDto) dao.read(id);
        if (userDto==null) {
            view.displayMessage("Usuario no encontrado");
            return null;
        }else{
            User user = new User(userDto.getId(), userDto.getName(),userDto.getUserName(),userDto.getPassword());
            view.display(user);
            return user;
        }
    }

    @Override
    public List<User> readAll() {
      return null;
    }

    @Override
    public boolean update(User user) {
       return true;
    }

    @Override
    public boolean delete(User user) {
        return true;
    }

}