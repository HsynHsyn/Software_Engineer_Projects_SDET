package Muhtar_SDET.Day26_ConstructorsContinue_StaticsIntro;

public class ConstructorCalls {

//      this(): refers to the calling constructors
//	    this. : to call instance variables & instance methods
// **** this(): used for calling constructors in another constructor// recursive constructor gives an error

//         Constructor Calls:
//      1. Constructors can not be called by its name ( this() need to be used)
//      2. Only a constructor can call another constructor
//		3. Constructor call MUST be at the first step
//		4. One constructor can not call more than one constructor
//		5. Constructor can not call or contain itself

    // special methods

    // default const runs all the time
    public ConstructorCalls(){ // we can overload constructors
        //this(); Constructor can not call or contain itself
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){ // we can overload constructors
        // *** ConstructorCalls(); can not call second time, so it is special method
        this(); // Only a constructor can call another constructor, must call at the first step
        System.out.println("Constructor with an argument" );
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument" );

    }

    public ConstructorCalls(String b){
        this();
        //this(); // One constructor can not call more than one times constructor
        System.out.println("Constructor with String argument" );

    }
    public static void method1(){
        System.out.println("method 1");
    }

    public static void method2(){
        method1();
        System.out.println("method 2");
    }


}
