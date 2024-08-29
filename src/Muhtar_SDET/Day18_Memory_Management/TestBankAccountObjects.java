package Muhtar_SDET.Day18_Memory_Management;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Hakan", 123456789);

        System.out.println(obj1);

        obj1.deposit(1000);
        obj1.checkBalance();
        obj1.withdraw(700);
        obj1.checkBalance();

        System.out.println("-------------------------------");

        BankAccount account1 = new BankAccount();
        account1.setInfo("Halime", 234578557);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Huseyin", 246796464);

        account1.deposit(5000);
        account2.deposit(100000);

        System.out.println(account1);
        System.out.println(account2);
    }


}
