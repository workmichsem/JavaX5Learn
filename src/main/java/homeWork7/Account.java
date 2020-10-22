package homeWork7;

public class Account {
    private int id;
    private String holder;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(){

    }

    public Account(int id, String holder, double amount){
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }
}