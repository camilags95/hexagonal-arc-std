package conta.system.domain.model;

import java.math.BigDecimal;


public class Account {

    private Integer number;
    private BigDecimal balance;
    private String client;

    public Account(){
        number = 0;
        balance = BigDecimal.ZERO;
        client = "Not informed";
    }

    public Account(Integer number, BigDecimal balance, String client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void creditAccount(BigDecimal value) throws BusinessException{

    }

    public void debitAccount(BigDecimal value) throws BusinessException{

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                ", client='" + client + '\'' +
                '}';
    }
}
