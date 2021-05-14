package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer_phones")
public class EmployerPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @ManyToOne()
    @JsonIgnoreProperties(value = {"phones"})
    private Employer employer;

    @Column(name = "phone_number")
    private String phoneNumber;

}
