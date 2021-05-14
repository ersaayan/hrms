package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao){
        super();
        this.candidateDao = candidateDao;
    }

    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }

    @Override
    public Candidate getById(int id) {
        return this.candidateDao.findById(id).get();
    }

    @Override
    public void add(Candidate candidate) {
        this.candidateDao.save(candidate);
    }

}
