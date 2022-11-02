package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "first_name_bangla")
    private  String firstNameBangla;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "last_name_bangla")
    private String lastNameBangla;

    @Column(name = "email_id")
    private String emailId;

    public Employee() {

    }

    public Employee(String firstName, String lastName,String firstNameBangla,String lastNameBangla, String emailId) {
        super();
        this.firstName = firstName;
        this.firstNameBangla = firstNameBangla;
        this.lastName = lastName;
        this.lastNameBangla = lastNameBangla;
        this.emailId = emailId;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstNameBangla() {
        return firstNameBangla;
    }

    public void setFirstNameBangla(String firstNameBangla) {
        this.firstNameBangla = firstNameBangla;
    }

    public String getLastNameBangla() {
        return lastNameBangla;
    }

    public void setLastNameBangla(String lastNameBangla) {
        this.lastNameBangla = lastNameBangla;
    }
}
