package homeWork7;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlType(name = "accounts")
@XmlRootElement
public class Accounts {
    public ArrayList accounts = new ArrayList();

    public Accounts() {
    }
}