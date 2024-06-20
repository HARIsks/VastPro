package SimpleOne;

public class NetSal {
	    public static void main(String[] args) {
	        if (args.length < 2) {
	            System.err.println("Please provide the base salary per day as a command-line argument");
	            return;
	        }

	        double dailySalary;
	        int numberOfDayAbsent;
	        try {
	            dailySalary = Double.parseDouble(args[0]);
	            numberOfDayAbsent=Integer.parseInt(args[1]);
	        } catch (NumberFormatException e) {
	            System.err.println("Base salary per day and number of day absent must be a valid number");
	            return;
	        }
	        netcal(dailySalary,numberOfDayAbsent);
	    }
	    
	    static void netcal(double dailySalary,int numberOfDayAbsent) {
	    	int daysPerMonth = 30;
	        double grossMonthlySalary = dailySalary * daysPerMonth;
	        double lossOfPayDays = dailySalary/2;
	        double amountLost = numberOfDayAbsent * lossOfPayDays;
	        double netMonthlySalary = grossMonthlySalary - amountLost;

	        System.out.printf("Base Salary per Day: Rs. %.2f%n", dailySalary);
	        System.out.printf("Number of Days Absent: %d days%n", numberOfDayAbsent);
	        System.out.printf("Amount Lost Due to Absence: Rs. %.2f%n", amountLost);
	        System.out.printf("Total Pay for 30 Days: Rs. %.2f%n", grossMonthlySalary);
	        System.out.printf("Net Monthly Salary after Deduction: Rs. %.2f%n", netMonthlySalary);
	    }

}
