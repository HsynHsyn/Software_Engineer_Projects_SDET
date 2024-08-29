package Muhtar_SDET.Day17_ClassAndObject_Intro.Task5_Laptop;

import java.util.Scanner;

public class Laptop {

    Scanner input = new Scanner(System.in);

    public double screenSize, totalPrice, storageAmount;
    public String cpuType,storageType,screenResolution;
    public short ramSize, storageSize;


    public void setInfo(double screenSize, String cpuType, String storageType, String screenResolution, short ramSize, double storageAmount) {
        this.screenSize = screenSize;
        this.cpuType = cpuType;
        this.storageType = storageType;
        this.screenResolution = screenResolution;
        this.ramSize = ramSize;
        //this.storageSize = storageSize;
        this.storageAmount = storageAmount;
    }

    public void select(){
        System.out.println("Select screen size (13.3, 15.0, 17.3 ) :" );
        screenSize = input.nextDouble();

       totalPrice += (screenSize == 13.3) ? 200: (screenSize== 15.0) ? 300: 400;

        System.out.println("Select CPU type (i3, i5, i7) : ");
        cpuType = input.next();

        totalPrice += (cpuType.equalsIgnoreCase("i5")) ? 250: (cpuType.equalsIgnoreCase("i5")) ? 350: 150;

        System.out.println("Select RAM size (4, 8, 16, 32, 64): ");
        ramSize = input.nextShort();

        totalPrice += ramSize/4 * 50;

        System.out.println("Select storage type and storage amount (HDD, SSD )(500, 1000, 2000) : ");
        storageType = input.next();
        storageAmount = input.nextDouble();

        if (storageType.equalsIgnoreCase("HDD")){
            totalPrice += storageAmount/500 * 50;
        } else if (storageType.equalsIgnoreCase("SSD")) {
            totalPrice += storageAmount/500 * 100;
        }

        //totalPrice += (storageType.equalsIgnoreCase("HDD")) ? 250: (storageType.equalsIgnoreCase("i5")) ? 350: 150;

//        System.out.println("Select storage size: ");
//        storageSize = input.nextShort();

        System.out.println("Select screen resolution (FULL HD,4K ): ");
        screenResolution = input.next();
        totalPrice += (screenResolution.equalsIgnoreCase("FULLHD")) ? 100: (screenResolution.equalsIgnoreCase("4K")) ? 200 : 0;

        System.out.println("Final price is : $" + totalPrice);


    }

    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", totalPrice=" + totalPrice +
                ", amount=" + storageAmount +
                ", cpuType='" + cpuType + '\'' +
                ", storageType='" + storageType + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                '}';
    }
}

/*
    Create a program that will build a custom laptop by allowing the user to select each part and computing the total price.
     Use the following requirements for each section:

    First ask the user about the screen size
        Select screen size:
        - For a screen size of `13.3`, add `$200` to the total price
        - For a screen size of `15.0`, add `300` to the total price
        - For screen size of `17.3`, add `$400` to the total price

    Then ask the user about the CPU
        Select CPU type:
        - For a CPU of `i5`, add `$250` to the total price
        - For a CPU of `i7`, add `$350` to the total price
        - For a CPU of `i3`, add `$150` to the total price

    Then ask the user about the RAM size
        Select RAM size:
        - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

    Then ask the user about the storage type and amount
        Select storage type:
        - For `HDD`, add `$50` to the total price for every 500GB
        - For `SSD`, add `$100` to the total price for every 500GB

    Then ask the user about the screen resolution
        Select screen resolution:
        - For `FULLHD`, add `$100` to the total price
        - For `4K`, add `$200` to the total price

    At the end display the total price of the custom computer
        Final price is: $amount

    Example Flow:
      Select screen size:
        13.3
      Select CPU type:
        i7
      Select RAM size:
        8
      Select storage type:
        SSD
      Select storage size:
        1000
      Select screen resolution:
        4K
      Final price is: $1050.0
 */
