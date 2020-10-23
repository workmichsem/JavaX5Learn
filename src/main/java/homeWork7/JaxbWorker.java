package homeWork7;

import javax.xml.bind.*;
import java.io.File;

public class JaxbWorker {
    public static void marshalXLM(Accounts data, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Account.class, Accounts.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(data, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Accounts unmarshalXML(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Account.class, Accounts.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Accounts) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
