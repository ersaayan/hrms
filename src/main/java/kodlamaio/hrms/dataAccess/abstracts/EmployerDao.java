package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    Optional<Employer>  findEmployerByPhonesPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
