package problem2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Grading_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");

		double score;

		System.out.println("Welcome to the Grading System!\n");
		System.out.print("Enter the student's score: ");
		score = sc.nextDouble();

		if (score < 0 || score > 100) {
			System.out.println("Error! Please Enter a valid score.\n");
			main(args);

		} else if (score <= 59) {
			System.out.println("Equivalent Grade: F");

		} else if (score <= 65) {
			System.out.println("Equivalent Grade: E");

		} else if (score <= 71) {
			System.out.println("Equivalent Grade: D");

		} else if (score <= 77) {
			System.out.println("Equivalent Grade: C");

		} else if (score <= 83) {
			System.out.println("Equivalent Grade: B");

		} else if (score <= 89) {
			System.out.println("Equivalent Grade: B+");

		} else if (score <= 95) {
			System.out.println("Equivalent Grade: A");

		} else if (score <= 100) {
			System.out.println("Equivalent Grade: A+");

		}
	}

}
