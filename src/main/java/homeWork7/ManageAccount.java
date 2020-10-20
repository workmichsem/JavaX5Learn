package homeWork7;

public class ManageAccount implements AccountService {
    @Override
    public void withdraw(int accountId, int amount) {


//        - при вводе в консоле команды withdraw [id] [amount] – снять
//        указанную сумму
    }

    @Override
    public void balance(int accountId) {
//        System.out.println("Владелец: " + );
//        System.out.println("Сумма на счете: " + );

//        - при вводе в консоле команды balance [id] – вывеси информацию о
//                счёте
    }

    @Override
    public void deposit(int accountId, int amount) {


//        - при вводе в консоле команды deposite [id] [amount] – внести на
//        счет указанную сумму
    }

    @Override
    public void transfer(int from, int to, int amount) {

//        - при вводе в консоле команды transfer [from] [to] [amount] –
//        перевести сумму с одного счета на другой
    }
}



