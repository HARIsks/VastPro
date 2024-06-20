package SimpleOne;

public class Sum{

	public static void main(String[] args) {
		        if (args.length < 2) {
		            System.err.println("Please provide both x and n as command-line arguments");
		            System.exit(1);
		        }
		        double x = 0.0;
		        int n = 0;
		        try {
		            x = Double.parseDouble(args[0]);
		            n = Integer.parseInt(args[1]);
		        } catch (NumberFormatException e) {
		            System.err.println("x must be a real number and n must be an integer type");
		            System.exit(1);
		        }
		        SumSeries(x, n);
	}
	static void SumSeries(double x,int n) {
        double sum = 1.0;
        double term = 1.0;
		 for (int i = 1; i <= n; i++) {
             term = term * x / i; 
             sum += term;
		 }
        System.out.println("The sum of the series is: " + sum);
	}
	       
}

