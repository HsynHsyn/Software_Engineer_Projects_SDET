package Muhtar_SDET.Day30_OOP_Inheritance_Continue.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person{

    private LocalDate electedDate;

    public President(char gender, LocalDate DOB, String name, LocalDate electedDate) {
        super(gender, DOB, name);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName() + " is lying");

    }
}
