package hu.wup.wuppadavans;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


public class Account {

    private String accountNumber;
    private String currency;

    @Override
    public String toString() {
        return "\nAccount details{" +
                "' Account number='" +accountNumber + '\''+
                "' Currency='"+currency+'\'' +

                "}";
    }


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
}
