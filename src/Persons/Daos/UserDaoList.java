package Persons.Daos;

import Dao.Dao;
import Persons.Dtos.UserDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class UserDaoList implements Dao<UserDto> {

    private HashMap<String, UserDto> userList;

    public UserDaoList() {
        userList = new HashMap();
    }

    @Override
    public boolean create(UserDto user) {
        if (user == null) return false;
        userList.put(user.getId(), user);
        return true;   
    }

    @Override
    public UserDto read(String id) {
        return userList.get(id);
    }

    @Override
    public List<UserDto> readAll() {
        return new ArrayList<UserDto>(userList.values());
    }

    @Override
    public boolean update(UserDto user) {
        return this.create(user);
    }

    @Override
    public boolean delete(UserDto user) {
        return userList.remove(user.getId()) != null;
    }

}
