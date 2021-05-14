package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserControllers {
    private UserService userService;
    @Autowired
    public UserControllers(UserService userService){
        super();
        this.userService = userService;
    }
    @GetMapping(path = "/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }
    @GetMapping(path = "/getbyid")
    public User getById(int id){
        return this.userService.getById(id);
    }
}


