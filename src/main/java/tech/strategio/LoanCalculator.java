package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param amount the remaining balance at the end of each month
     * @return the remaining amount after payment for three months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int months =3;
        int count = 0;
        while (count < months){
            amount = amount - (amount /10);
            count++;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
