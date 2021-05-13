package kodlamaio.hrms.entities.concretes;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="candidates")
public class Candidate extends User{

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="identification_number")
    private String identity_number;

    @Column(name="birth_date")
    private Date birt_date;

}
