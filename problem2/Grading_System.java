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

		if (score <= 59) {
			System.out.println("Equivalent Grade: F");

		} else if (score >= 60 && score <= 65) {
			System.out.println("Equivalent Grade: E");

		} else if (score >= 66 && score <= 71) {
			System.out.println("Equivalent Grade: D");

		} else if (score >= 72 && score <= 77) {
			System.out.println("Equivalent Grade: C");

		} else if (score >= 78 && score <= 83) {
			System.out.println("Equivalent Grade: B");

		} else if (score >= 84 && score <= 89) {
			System.out.println("Equivalent Grade: B+");

		} else if (score >= 90 && score <= 95) {
			System.out.println("Equivalent Grade: A");

		} else if (score >= 96 && score <= 100) {
			System.out.println("Equivalent Grade: A+");

		} else {
			System.out.println("Error! Please Enter a valid score.\n");
			main(args);
		}
	}

}
