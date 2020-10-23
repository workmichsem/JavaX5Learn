package homeWork7;

import javax.xml.bind.annotation.*;

@XmlType(name = "account", propOrder = {"id", "holder", "amount"})
public class Account {
    private int id;
    private String holder;
    private double amount;

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }

    @XmlElement(name = "holder")
    public String getHolder() {
        return holder;
    }

    @XmlElement(name = "amount")
    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    Account() {

    }

    public Account(int id, String holder, double amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }
}
