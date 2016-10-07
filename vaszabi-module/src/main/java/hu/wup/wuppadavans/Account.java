package hu.wup.wuppadavans;

/**
 * Created by szvarga on 2016. 10. 07..
 */
public class Account {

    public String accountNumber, currency;

    @Override
    public String toString() {
        return "Account details{" +
                "' Account number='" +accountNumber + '\''+
                "' Currency='"+currency+'\'' +

                "}\n";
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
