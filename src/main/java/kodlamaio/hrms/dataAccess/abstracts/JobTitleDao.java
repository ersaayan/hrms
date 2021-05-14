package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
    Optional<JobTitle> findByTitle(@Param("title") String title);
}
