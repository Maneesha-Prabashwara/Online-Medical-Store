package org.example.onlinemedicalstore.Interfaces;

import org.example.onlinemedicalstore.Classes.User;

import java.io.IOException;
import java.util.List;

public interface IUserFileHandler {
    void saveUser(User user) throws IOException;
    User getUserById(String id);
    User getUserByUsername(String username);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(String id);
}