package homeWork7;

import javax.xml.bind.*;
import java.io.File;

public class JaxbWorker {

//    public static DataWrapper createAcount(int id, int uId, String fio, double amount) {
//        DataWrapper data = new DataWrapper();
//        data.setId(id);
//        data.setUniqueId(uId);
//        data.setHolder(fio);
//        data.setAmount(amount);
//        return data;
//    }

    public static void marshalXLM(DataWrapper data, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(DataWrapper.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(data, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void marshalXLM(DataWrapper[] data, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(DataWrapper.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(data, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static DataWrapper unmarshalXML(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DataWrapper.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (DataWrapper) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


}
