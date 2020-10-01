package edu.escuelaing.IETI.TaskPlanner.Persistence.Impl;

import edu.escuelaing.IETI.TaskPlanner.Model.User;
import edu.escuelaing.IETI.TaskPlanner.Persistence.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepositoryImpl implements UserRepository {

    List<User> usuarios = new ArrayList<User>();
    @Override
    public List<User> getAll() {
        return usuarios;
    }

    @Override
    public User getById(String userId) {
        for (User us : usuarios){
            if (us.getCorreo().equals(userId)){
                return us;
            }
        }
        return null;
    }

    @Override
    public User create(User user) {
        usuarios.add(user);
        return getById(user.getCorreo());
    }

    @Override
    public User update(User user) {
        User viejo = getById(user.getCorreo());
        viejo.setArea(user.getArea());
        viejo.setNombre(user.getNombre());
        return getById(viejo.getCorreo());
    }

    @Override
    public void remove(String userId) {
        int index = 0;
        boolean flag = false;
        for (int i=0; i<usuarios.size(); i++){
            if (usuarios.get(i).getCorreo().equals(userId)){
                index = i;
                flag = true;
                break;
            }
        }
        if(flag) {
            usuarios.remove(index);
        }

    }
}
