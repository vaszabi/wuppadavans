package hu.wup.wuppadavans.entity;

import javax.persistence.*;


@Entity
@Table(name = "upp_account")
public class AccountsEntity {

    private String accountNumber;
    private String currency;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = UsersEntity.ID_COLUMN_NAME)
    private UsersEntity user;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }
}

