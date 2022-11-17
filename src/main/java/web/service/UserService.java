package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();

    User showUserById(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}