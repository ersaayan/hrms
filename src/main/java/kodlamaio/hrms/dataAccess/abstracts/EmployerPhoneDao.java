package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.EmployerPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerPhoneDao extends JpaRepository<EmployerPhone, Integer> {
}
