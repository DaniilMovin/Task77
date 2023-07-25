package web.services;

import web.model.User;

import java.util.List;

public interface UserService {
    void removeUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
    List<User> getAllUsers();
    User getUser(Long id);

}
