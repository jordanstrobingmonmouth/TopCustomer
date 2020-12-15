import java.util.Scanner;
import java.util.ArrayList;

public class TopCustomer {
	
	private static ArrayList<String> name = new ArrayList<String>();
	private static ArrayList<Double> price = new ArrayList<Double>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		Boolean yes = true;
		
		while (yes) {
			int counter = 0;
			System.out.println("Enter a price (0 to stop): ");
			double number = in.nextInt();
			if (number == 0) {
				break;
			}
			else {
				price.add(number);
				System.out.println("Enter the name: ");
				name.add(in.next());
				
			}
			counter++;
		
		}
		TopCustomer cust = new TopCustomer();
		System.out.println("The top customer is: " + cust.nameOfBestCustomer());
	}
	
	public String nameOfBestCustomer() {
		double max = 0;
		int index = 0;
		for (int i = 0; i < price.size(); i++) {
			 if (max < price.get(i)) {
				max = price.get(i);
				index = price.indexOf(max);
			 }
			}
		String topCust = name.get(index);
		return topCust;
	}
}
