package SimpleOne;

public class BaseSal {
	    public static void main(String[] args) {
	        if (args.length < 1) {
	            System.err.println("Please provide the base salary per day as a command-line argument.");
	            return;
	        }

	        double dailySalary;
	        
	        try {
	            dailySalary = Double.parseDouble(args[0]);
	        } catch (NumberFormatException e) {
	            System.err.println("Base salary per day must be a valid number.");
	            return;
	        }

	        int daysPerMonth = 30;
	        double monthlySalary = dailySalary * daysPerMonth;
	        
	        System.out.printf("Base Salary per Day: Rs. %.2f%n", dailySalary);
	        System.out.printf("Total Pay for %d Days: Rs. %.2f%n", daysPerMonth, monthlySalary);
	    }

}
