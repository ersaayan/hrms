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

    public Candidate(){

    }

    public Candidate(String email, String password, String first_name, String last_name, String identity_number, Date birt_date){
        this.setEmail(email);
        this.setPassword(password);
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setIdentity_number(identity_number);
        this.setBirt_date(birt_date);
    }
}

