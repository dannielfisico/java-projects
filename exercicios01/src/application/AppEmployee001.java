package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee001;

public class AppEmployee001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner osk = new Scanner(System.in);
		
		List<Employee001> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados? ");
		int quantity = osk.nextInt();
		osk.nextLine();
		System.out.println();
		for(int i = 0; i < quantity; i++) {
			System.out.printf("\nFuncionário #%d:\n", i+1);
			System.out.print("Id: ");
			int id = osk.nextInt();
			osk.nextLine();
			System.out.print("Nome: ");
			String name = osk.nextLine();
			System.out.print("Salário: ");
			double salary = osk.nextDouble();
			osk.nextLine();
			
			Employee001 emp = new Employee001(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.print("\nInforme o Id do funcionário que terá o salário aumentado: ");
		int id = osk.nextInt();
		
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getId() == id) {
					System.out.print("Informe a porcentagem: ");
					double percent = osk.nextDouble();
					list.get(i).increaseSalary(percent);
				} else {
					System.out.printf("\nO id (%d) não foi localizado.\n", id);
					
				}
			}
		
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		
		osk.close();

	}

}
