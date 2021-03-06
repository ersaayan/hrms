package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.JobTitle;

import java.util.List;


public interface JobTitleService {
    List<JobTitle> getAll();
    JobTitle getById(int id);
    JobTitle getByTitle(String title);
}
