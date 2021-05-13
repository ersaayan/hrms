package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/employers")
public class EmployerControllers {

    private EmployerService employerService;

    public EmployerControllers(EmployerService employerService){
        super();
        this.employerService = employerService;
    }
    @GetMapping(path = "/getall")
    public List<Employer> getAll(){
        return this.employerService.getAll();
    }
    @GetMapping(path="/getbyid")
    public Employer getById(int id){
        return this.employerService.getById(id);
    }
}
