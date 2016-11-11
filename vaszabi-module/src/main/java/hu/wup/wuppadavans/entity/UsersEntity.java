package hu.wup.wuppadavans.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "upp_user")
public class UsersEntity {

    public static final String ID_COLUMN_NAME = "User_Id";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_COLUMN_NAME)
    private String firstname;
    private String gender;
    private String lastname;
    private int age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<AccountsEntity> accountsEntityList;

    public UsersEntity(String firstname, String lastname, String gender, int age) {
        this.firstname = firstname;
        this.lastname= lastname;
        this.gender = gender;
        this.age = age;
    }


    public List<AccountsEntity> getAccountsEntityList() {
        return accountsEntityList;
    }

    public void setAccountsEntityList(List<AccountsEntity> accountsEntityList) {
        this.accountsEntityList = accountsEntityList;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
