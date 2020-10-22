package homeWork7;

public class MainTask {
    public static void main(String[] args) {
        String fileName = "./src/main/java/homeWork7/data.xml";
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(200 + i, "User-" + i, 10000.0 + i);
        }
        JaxbWorker.marshalXLM(DataWrapper.createUserArray(accounts), fileName);

        //JaxbWorker.marshalXLM(new DataWrapper(1, 1002, "Petrov Ivan", 555884.0), fileName);
//        try {
            DataWrapper unmarshDaata = JaxbWorker.unmarshalXML(fileName);
            if (unmarshDaata != null) {
                System.out.println(unmarshDaata.toString());
            }
//        } catch (Exception e) {
//            Account[] accounts = new Account[10];
//            for (int i = 0; i < 10; i++) {
//                accounts[i] = new Account(200 + i, "User-" + i, 10000.0 + i);
//            }
//            JaxbWorker.marshalXLM(DataWrapper.createUserArray(accounts), fileName);
//        }
    }
}