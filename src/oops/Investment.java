package oops;

import java.util.Scanner;

class SimpleInterest implements InterestCal{
	public double calInterest(double p, int n, double r){
		return  p * n * r / 100;
	}
}

class CompoundInterest implements InterestCal{
	public double calInterest(double p, int n, double r){
		return  p * Math.pow((1 + r / 100), n) - p;
	}
}

public class Investment {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Please enter the Fixed Deposit Amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Please enter the Duration of deposit in years: ");
	        int years = scanner.nextInt();

	        System.out.print("Is interest compound or simple? ");
	        String interestType = scanner.next().toLowerCase();

	        double interestRate = 6.5;

	        InterestCal calculator;

	        if (interestType.equals("compound")) {
	            calculator = new CompoundInterest();
	        } else {
	            calculator = new SimpleInterest();
	        }

	        double interest = calculator.calInterest(principal, years, interestRate);
	        double totalAmount = principal + interest;

	        System.out.printf("Principal Amount: Rs. %.2f%n", principal);
	        System.out.printf("Duration: %d years%n", years);
	        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
	        System.out.printf("Interest Amount: Rs. %.2f%n", interest);
	        System.out.printf("Total Amount after %d years: Rs. %.2f%n", years, totalAmount);

	        scanner.close();
	    }

}
