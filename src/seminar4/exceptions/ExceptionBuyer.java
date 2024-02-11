package seminar4.exceptions;

public class ExceptionBuyer extends RuntimeException {
    public ExceptionBuyer() {
        super("Такого покупателя не существует");
    }
}
