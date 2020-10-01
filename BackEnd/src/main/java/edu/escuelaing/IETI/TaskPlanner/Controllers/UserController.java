package edu.escuelaing.IETI.TaskPlanner.Controllers;

import edu.escuelaing.IETI.TaskPlanner.Model.User;
import edu.escuelaing.IETI.TaskPlanner.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService uS;

    @GetMapping("/")
    String principal(){
        return "Pagina inicio";
    }

    @GetMapping("/Users")
    List<User> all() {
        return uS.getAll();
    }

    @GetMapping("/User/{userId}")
    User getById(@PathVariable String userId) {
        User usuario = uS.getById(userId);
        return usuario;
    }

    @PostMapping("/User")
    User create(@RequestBody User user){
        return uS.create(user);
    }

    @PutMapping ("/User/{userId}")
    User update(@RequestBody User user, @PathVariable String userId) {
        if (uS.getById(userId) != null) {
            return uS.update(user);
        }
        return uS.create(user);
    }

    @DeleteMapping ("/User/{userId}")
    void remove(@PathVariable String userId){
        uS.remove(userId);
    }






}
