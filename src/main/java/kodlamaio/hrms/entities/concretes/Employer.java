package kodlamaio.hrms.entities.concretes;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name="employers")
public class Employer extends User{

    @Column(name="company_name")
    private String company_name;
    @Column(name = "web_address")
    private String web_address;
    @Column(name = "phone_number")
    private String phone_number;

}
