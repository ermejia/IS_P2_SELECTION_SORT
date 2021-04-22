package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.SelectionSort;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class SelectionSortApplication {
	/**
	 * Driver to manage the application
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Printer print = new Printer();

		System.out.print("Enter the number of words you want to order: ");
		int n = input.nextInt();
		String[] orderedArray = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Word" + (i + 1) + ": ");
			orderedArray[i] = input.next();
		}

		System.out.print("The output in order is: ");
		SelectionSort sortWord = new SelectionSort();
		sortWord.selectionSort(orderedArray);
		print.printArray(orderedArray);
	}
}
