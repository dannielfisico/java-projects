package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

import entities.Funcionarios;

public class FolhaPagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		Funcionarios[] vect = new Funcionarios[n];
		
			for (int i = 0; i < vect.length; i++) {
				System.out.printf("Employee #%d:%n", i+1);
				System.out.print("Id: ");
				int key = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				System.out.println();
				vect[i] = new Funcionarios(key, name, salary);
			}
			
			System.out.println("Enter the employee id that will be have increase: ");
			int id = sc.nextInt();
			sc.nextLine();
			boolean response;
			int index = 0;
			int i = 0;
				do {
					if(vect[i].getKey() == id) {
						response = true;
						index = i;
					} else {
						response = false;
					}
					i++;
					
				} while (response != true || i > vect.length);
			
			if(response == true) {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				vect[index].increaseSalary(percent);
				System.out.printf("%nList of employees:");
				Arrays.stream(vect).forEach(System.out::println);
			} else {
				System.out.println("This id does not exist!");
			}
			
		
		sc.close();

	}

}
