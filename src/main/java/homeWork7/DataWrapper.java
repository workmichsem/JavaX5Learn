package homeWork7;

import javax.xml.bind.annotation.*;

// определяем корневой элемент
@XmlRootElement(name = "User")
// определяем последовательность тегов в XML
@XmlType(propOrder = {"uniqueId", "holder", "amount"})
public class DataWrapper {

    private int id;
    private int uniqueId;
    private String holder;
    private double amount;

    public DataWrapper() {
    }

    public DataWrapper(int id, Account account) {
        this.id = id;
        this.uniqueId = account.getId();
        this.holder = account.getHolder();
        this.amount = account.getAmount();
    }

    public static DataWrapper[] createUserArray(Account[] account) {
        DataWrapper[] dataWrappers = new DataWrapper[account.length];
        for (int i = 0; i > account.length; i++) {
            dataWrappers[i].setId(i + 1);
            dataWrappers[i].setUniqueId(account[i].getId());
            dataWrappers[i].setHolder(account[i].getHolder());
            dataWrappers[i].setAmount(account[i].getAmount());
        }
        return dataWrappers;
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uniqueId='" + uniqueId + '\'' +
                ", age=" + holder +
                ", language='" + amount + '\'' +
                '}';
    }
}