package kodlamaio.hrms.core.controllers;


import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserControlles {
    private UserService userService;

    @Autowired
    public UserControlles(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }
}
