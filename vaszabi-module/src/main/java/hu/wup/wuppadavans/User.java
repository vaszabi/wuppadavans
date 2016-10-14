package hu.wup.wuppadavans;

import java.util.ArrayList;
import java.util.List;

public class User extends Account {


    public String firstname, lastname, gender;
    public int age;
    public long id;
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" + " id='" + id + '\'' +

                ", First name='" + firstname + '\'' +
                ", Last name='" + lastname + '\'' +
                ", Age=" + age +
                ", Gender='" + gender + '\'' + accounts +
                // "' Account number='" + accountNumber + '\'' +
              //  "' Currency='" + currency + '\'' +

                "}\n";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
