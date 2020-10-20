package homeWork7.Exception;

public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException() {
        super("Недостаточно средств на счете");
    }
}
