package SimpleOne;

public class Gst {
	    public static void main(String[] args) {
	        if (args.length < 2) {
	            System.err.println("Please provide product name and selling price as command-line arguments.");
	            return;
	        }
	        String productName = args[0];
	        double sellingPrice;

	        try {
	            sellingPrice = Double.parseDouble(args[1]);
	        } catch (NumberFormatException e) {
	            System.err.println("Product Name must be String and Selling price must be a valid number");
	            return;
	        }
	        
	        GstCal(productName, sellingPrice);
	    }
	    
	    static void GstCal(String productName,double sellingPrice) {
	        double gstAmount = sellingPrice * 0.18;
	        double totalAmount = sellingPrice + gstAmount;

	        System.out.println("Product Name: " + productName);
	        System.out.println("Selling Price: Rs. " + sellingPrice);
	        System.out.println("GST (18%): Rs. " + gstAmount);
	        System.out.println("Total Amount (including tax): Rs. " + totalAmount);
	    }
	    
}
