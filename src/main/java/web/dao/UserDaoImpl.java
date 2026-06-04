package web.dao;

import web.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}
