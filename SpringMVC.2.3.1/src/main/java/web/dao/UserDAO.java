package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> allUsers();

    void add(User film);

    void delete(User film);

    void edit(User film);

    User getById(int id);
}
