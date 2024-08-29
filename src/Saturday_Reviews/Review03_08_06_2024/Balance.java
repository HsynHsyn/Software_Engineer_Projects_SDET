package Saturday_Reviews.Review03_08_06_2024;

public class Balance {
    public static void main(String[] args) {
        double balanceAmount = 1000.0;
        double withdrawAmount = 2000.0;
        //decrease balanceAmount by withdrawAmount
        balanceAmount -= withdrawAmount;

        //check if balance amount is negative. and add $35 fee
        if (balanceAmount < 0) {
            balanceAmount -= 35;
            System.out.println("Account overdraft fee applied");
        }

        System.out.println("Remaining balance = $" + balanceAmount);

    }
}





/*
Balance [single if, operators, variables]

    Declare and assign the following variables
        amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft fee
        to the balance by subtracting $35

    In both cases print the remaining balance after withdrawing
 */