package Muhtar_SDET.Day05_Operators;

public class ShortHandOperator {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);

        a =40;
        System.out.println(a);

        System.out.println("-------------------------------");

        double balance = 100;
        balance += 1000; // balance = balance+1000

        System.out.println("balance = " + balance);
        balance += 500;
        System.out.println("balance = " + balance);
        balance -= 10000;
        System.out.println("balance = " + balance);
        System.out.println("-------------------------------");

        balance -= 1000;
        System.out.println("balance = " + balance);
        balance -= 5000;
        System.out.println("balance = " + balance);
        System.out.println("-------------------------------");

        double salary = 45000;
        salary *= 2; // salary=45000*2
        System.out.println("salary = " + salary);
        salary *= 3;
        System.out.println("salary = " + salary);
        System.out.println("-------------------------------");

        double eth = 4;
        eth *= 250;
        System.out.println("eth = " + eth);

        System.out.println(salary);
         salary/=2;
        System.out.println("salary = " + salary);

        System.out.println("-------------------------------");

        int b =39;
        b %= 7;
        System.out.println(b);




    }
}
