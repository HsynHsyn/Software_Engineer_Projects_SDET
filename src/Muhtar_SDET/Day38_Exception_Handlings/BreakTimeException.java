package Muhtar_SDET.Day38_Exception_Handlings;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){
        super("It is break time");
    }

    public BreakTimeException(String message){
        super(message); // RuntimeException has  public RuntimeException(String message)  {super(message);


    }
}
