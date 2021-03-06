package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployerPhoneService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.EmployerPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/employers")
public class EmployerControllers {

    private EmployerService employerService;
    private EmployerPhoneService employerPhoneService;

    public EmployerControllers(EmployerService employerService, EmployerPhoneService employerPhoneService){
        super();
        this.employerService = employerService;
        this.employerPhoneService = employerPhoneService;
    }

    @GetMapping(path = "/getall")
    public List<Employer> getAll(){
        return this.employerService.getAll();
    }

    @GetMapping(path="/getbyid")
    public Employer getById(int id){
        return this.employerService.getById(id);
    }

    @GetMapping(path = "getphones")
    public List<EmployerPhone> getPhones(){
        return this.employerPhoneService.getAll();
    }

    @GetMapping(path = "getbyphonenumber/{phoneNumber}")
    public Employer getByPhoneId(@PathVariable String phoneNumber){
        return this.employerService.getByPhoneNumber(phoneNumber);
    }
}
