package homeWork8.Exception;

public class UnknownAccountException extends RuntimeException {
    public UnknownAccountException() {
        super("Неизвестный аккаунт");
    }
}
