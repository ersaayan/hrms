package kodlamaio.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="employers")
public class Employer extends User{

    @Column(name="company_name")
    private String company_name;
    @Column(name = "web_address")
    private String web_address;

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("employer")
    private List<EmployerPhone> phones;

}
