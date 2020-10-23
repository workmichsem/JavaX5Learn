package homeWork7;

public class MainTask {
    public static void main(String[] args) {
        String fileName = "./src/main/java/homeWork7/data.xml";
        Accounts accounts = new Accounts();

        Accounts unmarshData = JaxbWorker.unmarshalXML(fileName);
        if (unmarshData == null) {
            accounts.accounts.add(new Account(101, "holder-1", 10000.0));
            accounts.accounts.add(new Account(102, "holder-2", 10000.0));
            accounts.accounts.add(new Account(103, "holder-3", 10000.0));
            accounts.accounts.add(new Account(104, "holder-4", 10000.0));
            accounts.accounts.add(new Account(105, "holder-5", 10000.0));
            accounts.accounts.add(new Account(106, "holder-6", 10000.0));
            accounts.accounts.add(new Account(107, "holder-7", 10000.0));
            accounts.accounts.add(new Account(108, "holder-8", 10000.0));
            accounts.accounts.add(new Account(109, "holder-9", 10000.0));
            accounts.accounts.add(new Account(110, "holder-10", 10000.0));
            JaxbWorker.marshalXLM(accounts, fileName);
        }

        ManageAccount manageAccount = new ManageAccount();
        manageAccount.balance(102);
        manageAccount.withdraw(102, 50);
        manageAccount.balance(102);
        manageAccount.deposit(102, 100);
        manageAccount.balance(102);
        manageAccount.balance(105);
        manageAccount.transfer(102, 105, 1000);
        manageAccount.balance(102);
        manageAccount.balance(105);
    }
}