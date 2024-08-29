package Muhtar_SDET.Day38_Exception_Handlings.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }

}
