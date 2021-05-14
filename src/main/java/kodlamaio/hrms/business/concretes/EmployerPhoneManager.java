package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerPhoneService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerPhoneDao;
import kodlamaio.hrms.entities.concretes.EmployerPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerPhoneManager implements EmployerPhoneService {

    private EmployerPhoneDao employerPhoneDao;

    public EmployerPhoneManager(EmployerPhoneDao employerPhoneDao) {
        super();
        this.employerPhoneDao = employerPhoneDao;
    }
    @Override
    public List<EmployerPhone> getAll() {
        return this.employerPhoneDao.findAll();
    }
}
