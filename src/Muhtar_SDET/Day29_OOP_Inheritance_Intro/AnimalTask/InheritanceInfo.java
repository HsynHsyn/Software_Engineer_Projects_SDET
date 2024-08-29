package Muhtar_SDET.Day29_OOP_Inheritance_Intro.AnimalTask;

public class InheritanceInfo {

    //attributes;
    // it is used public class because to use from child classes
    // inheritance is maintainable
    // Object Class:  parent of all the classes ( implicitly inherited), in the lang package
    // finalize() method for deleting class (garbage collection)
    // Constructor name has to be same class name because of that *** Constructor cannot be inheritance ***

    // *** Constructors are not inherited, but child class must call one of parent class’
    // *** Private variables and methods are not inherited.***
    // *** All the accessible variables & methods (depending on the access modifier)

    /*

OOP Inheritance: to build IS A relationship between the classes (parent/child,  super/sub)

				easiest way to get rich ===> extends

				Child class (sub): can inherit all the variables & methods that are accessible/visible from the parent class

				Parent class (super): can NOT inherit anything from child class. contains all the common features (variables/methods) of all child classes

				Class A extends Class B

				Advantages:
					-less codes
					-improves the reusability
					-clean
					-less memory usage
					-easy to maintain
				One class can ONLY extend one class
				One class can be extended by MULTIPLE classes
     */
}
