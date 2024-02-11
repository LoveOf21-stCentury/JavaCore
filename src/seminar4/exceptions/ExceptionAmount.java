package seminar4.exceptions;

public class ExceptionAmount extends RuntimeException {
    public ExceptionAmount() {
        super("Такого колличества не осталось");
    }
}
