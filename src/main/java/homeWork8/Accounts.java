package homeWork8;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;

@XmlType(name = "accounts")
@XmlRootElement
public class Accounts {
    public ArrayList accounts = new ArrayList();

    public Accounts() {
    }
}