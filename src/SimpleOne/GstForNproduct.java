package SimpleOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GstForNproduct {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double totalBill = 0.0;
	        double salesTaxRate = 0.18;
	        List<String> products = new ArrayList<>();
	        List<Double> prices = new ArrayList<>();

	        System.out.println("Enter product names and their prices. Enter 'e' to end");
	        
	        while (true) {
	            System.out.print("Enter product name (or 'e' to end): ");
	            String productName = scanner.nextLine().trim();

	            if (productName.equalsIgnoreCase("e")) {
	                break;
	            }

	            products.add(productName);

	            System.out.print("Enter price for " + productName + ": ");
	            double price;
	            try {
	                price = Double.parseDouble(scanner.nextLine().trim());
	            } catch (NumberFormatException e) {
	                System.err.println("Invalid price format. Please enter a valid number.");
	                continue;
	            }

	            prices.add(price);
	            totalBill += price;
	        }

	        double salesTax = totalBill * salesTaxRate;
	        double totalAmount = totalBill + salesTax;

	        System.out.println("\n--- Bill Details ---");
	        for (int i = 0; i < products.size(); i++) {
	            String productName = products.get(i);
	            double price = prices.get(i);
	            System.out.println((i + 1) + ". " + productName + ": Rs. " + price);
	        }

	        System.out.println("\nBill Amount: Rs. " + totalBill);
	        System.out.println("Sales Tax (18%): Rs. " + salesTax);
	        System.out.println("Total Bill Amount (including tax): Rs. " + totalAmount);

	        scanner.close();
	    }
}
