package edu.escuelaing.IETI.TaskPlanner.ServicesImpl;

import edu.escuelaing.IETI.TaskPlanner.Model.User;
import edu.escuelaing.IETI.TaskPlanner.Persistence.UserRepository;
import edu.escuelaing.IETI.TaskPlanner.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    UserRepository uR;

    @Override
    public List<User> getAll() {
        return uR.getAll();
    }

    @Override
    public User getById(String userId) {
        return uR.getById(userId);
    }

    @Override
    public User create(User user) {
        return uR.create(user);
    }

    @Override
    public User update(User user) {
        return uR.update(user);
    }

    @Override
    public void remove(String userId) {
        uR.remove(userId);
    }
}
