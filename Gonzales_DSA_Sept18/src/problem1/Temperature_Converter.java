package problem1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature_Converter {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner (System.in);

		int choose;
		double temp;
		double convert;

		System.out.println("Welcome to Fahrenheit to Celsius Converter!");
		System.out.println("Enter [1|2] to choose what you want to convert or [3] if you want to exit");
		System.out.println("[1] Fahrenheit to Celsius\n[2] Celsius to Fahrenheit\n[3] Exit");
		choose = sc.nextInt();

		if (choose == 1) {
			System.out.print("\nYou have chosen Fahrenheit to Celsius Converter\nEnter Fahrenheit: ");
			temp = sc.nextDouble();
			convert = (temp - 32) * 5/9;
			System.out.println(temp + " Degree Fahrenheit converted to"
									+ " Degree Celsius :: " + df.format(convert)
									+ " Degree Celsius\n");
			main(args);

		} else if (choose == 2) {
			System.out.print("\nYou have chosen Celsius to Fahrenheit Converter\nEnter Celsius: ");
			temp = sc.nextDouble();
			convert = (temp * 9/5) + 32;
			System.out.println(temp + " Degree Celsius converted to"
									+ " Degree Fahrenheit :: " + df.format(convert)
									+ " Degree Fahrenheit\n");
			main(args);

		} else if (choose == 3){
			System.out.println("Thank you for using Temperature Conversion! Good bye!");
			System.exit(0);

		} else {
			System.out.println("ERROR. Please choose only between [1|2]\n");
			main(args);
		}

	}

}
