package Assignments.ControlStructures.Selection;
/*
TODO: problem description
*/
public class Assignment_05 {
    public static void main(String[] args) {
        int accountNumber = 1001, salary = 40000, accountBalance = 250000, loanAmountExpected = 300000, emisExpected = 30;
        String loanType = "Car";
        String acct = Integer.toString(accountNumber);
        if (acct.length() == 4 && acct.charAt(0) == '1') {
            if (accountBalance >= 1000) {
                // TODO
            } else {
                System.out.println("Need a minimum balance of $1000");
            }
        } else {
            System.out.println("Invalid Account Number");
        }
    }
}
