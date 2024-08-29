package Muhtar_SDET.Day28_OOP_Encapsulation.Encapcilation;

public class EncapsulationInfo {
    //Why java is not pure object-oriented programming:
      //      1. primitives
	 //       2. static
	//	      3. enumerations
    // An object hides its internal data from code that’s outside the class
    // Only the current class’ methods can directly access and make changes to the instance variables
    // Hide an instance variable by giving private access modifier, and making the methods that access those fields public
    // These *** public methods are called getters & setters (accessor and mutator) // it can be used other access modifiers, but it is usually used public

    // *** Encapsulation: hiding the data by giving private access modifiers ***
    //
    //		getter (READ ONLY): public instance methods
    //							return type has to match with the data type of the instance variable
    //					    *** passes no parameters
    //
    //		setter (WRITE ONLY): public instance methods
    //							 return type is void
    //							 passes a parameter

}
