package Muhtar_SDET.Day38_Exception_Handlings.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){ // RuntimeException has a constructor which has parameter like RuntimeException (String message)
        super(message);
    }

}
