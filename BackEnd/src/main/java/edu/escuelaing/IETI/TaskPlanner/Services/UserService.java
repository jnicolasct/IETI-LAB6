package edu.escuelaing.IETI.TaskPlanner.Services;

import edu.escuelaing.IETI.TaskPlanner.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}
