package kodlamaio.hrms.core.controllers;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleControllers {
    private JobTitleService jobTitleService;

    public JobTitleControllers(JobTitleService jobTitleService){
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return this.jobTitleService.getAll();
    }
}
