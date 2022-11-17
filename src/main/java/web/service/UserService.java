package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.User_Dao;
import web.model.User;

import java.util.List;

@Service
public class UserService implements User_Service {
    private final User_Dao userDao;

    public UserService(User_Dao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User showUserById(int id) {
        return userDao.showUserById(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User updatedUser) {
        userDao.update(id, updatedUser);

    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
