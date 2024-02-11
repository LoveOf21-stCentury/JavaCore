package seminar4.exceptions;

public class ExceptionProduct extends RuntimeException{
    public  ExceptionProduct(){
        super("Нет такого продукта");
    }
}
