package CRM.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table
public class Customer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;


}
