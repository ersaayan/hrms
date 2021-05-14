package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/candidates")
public class CandidateControllers {

    private CandidateService candidateService;

    @Autowired
    public CandidateControllers(CandidateService candidateService){
        super();
        this.candidateService = candidateService;
    }

    @GetMapping(path = "/getall")
    public List<Candidate> getAll(){
        return this.candidateService.getAll();
    }

    @GetMapping(path = "/getbyid")
    public Candidate getById(int id){
        return this.candidateService.getById(id);
    }

    @PostMapping(path = "/add")
    public Result add(@RequestBody Candidate candidate){
        this.candidateService.add(candidate);
        return new SuccessResult("Kullanıcı eklendi");
    }
}
