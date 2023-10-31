package Assignments.ControlStructures.Selection;
/*
TODO: problem description
*/
public class Assignment_06 {
    public static void main(String[] args) {
        int accountNumber = 1001, salary = 40000, accountBalance = 250000, loanAmountExpected = 300000, emisExpected = 30;
        String loanType = "Car";
        if ((int) Math.floor(Math.log10(accountNumber) + 1) == 4 && accountNumber % 1000 == 1) {
            if (accountBalance >= 1000) {
                if (loanType.equals("Car") && loanAmountExpected <= 500000 && emisExpected <= 36) {
                    System.out.println("eligibleLoanAmount=" + 500000);
                    System.out.println("eligibleEmis=" + 36);
                } else if (loanType.equals("House") && loanAmountExpected <= 6000000 && emisExpected <= 60) {
                    System.out.println("eligibleLoanAmount=" + 6000000);
                    System.out.println("eligibleEmis=" + 60);
                } else if (loanType.equals("Business") && loanAmountExpected <= 7500000 && emisExpected <= 84) {
                    System.out.println("eligibleLoanAmount=" + 7500000);
                    System.out.println("eligibleEmis=" + 84);
                } else {
                    System.out.println("Not eligible for a loan!");
                }
            } else {
                System.out.println("Need minimum balance of $1000 in the account!");
            }
        } else {
            System.out.println("Invalid Account Number!");
        }
    }
}