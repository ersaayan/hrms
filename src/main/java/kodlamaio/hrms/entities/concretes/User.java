package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id", updatable = false, nullable = false)
    private int id;

    @Column(name="email_address")
    private String email;

    @Column(name="password")
    private String password;

    public User(){
    }

    public User(String email, String password){
        this.setEmail(email);
        this.setPassword(password);
    }

}
