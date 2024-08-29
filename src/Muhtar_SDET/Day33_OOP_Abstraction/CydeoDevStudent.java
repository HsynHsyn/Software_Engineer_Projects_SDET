package Muhtar_SDET.Day33_OOP_Abstraction;

import Muhtar_SDET.Day32_FinalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id ;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate datOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, datOfBirth);
        if (getAge() < 18){
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("Alumni Dev")){
            this.batchName = batchName;
        }
        else{ // if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \n No such a batch in Cydeo");
        }

    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0 ){
            System.err.println("Invalid batch number : " + batchNumber + " \nBatch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", datOfBirth=" + getDatOfBirth() +
                "id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                "} " ;
    }
}

/*
Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */