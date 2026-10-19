package Exception;

public class NegativeSideException extends Exception {
    public NegativeSideException(){
        super("Неправильно указана сторона");
    }
}
