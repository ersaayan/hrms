package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="Id")
    private int id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(){

    }




}
