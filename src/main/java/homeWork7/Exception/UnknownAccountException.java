package homeWork7.Exception;

public class UnknownAccountException extends RuntimeException {
    public UnknownAccountException() {
        super("Неизвестный аккаунт");
    }
}
