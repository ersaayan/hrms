package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/jobtitle")
public class JobTitleControllers {
    private JobTitleService jobTitleService;

    public JobTitleControllers(JobTitleService jobTitleService){
        this.jobTitleService = jobTitleService;
    }

    @GetMapping(path = "/getall")
    public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }

    @GetMapping(path = "/getbyid")
    public JobTitle getById(int id){
        return this.jobTitleService.getById(id);
    }
}
