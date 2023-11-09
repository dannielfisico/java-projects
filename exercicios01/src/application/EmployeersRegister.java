package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeersRegister {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serãoo registrados? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		List<Employee> list = new ArrayList<>();
		int response = 1;
			do {
				System.out.println("\nEmployee #"+response);
				System.out.print("Id: ");
				int id = sc.nextInt();
				while(hasId(list, id)) {
					System.out.print("Este id está em uso. Tente Outro: ");
					id = sc.nextInt();
				}
				
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				sc.nextLine();
				list.add(new Employee(id, name, salary) );
				
				response++;
			} while (response <= quantity);
			
			System.out.print("\nEntre com o Id do funcionário que receberá um aumento salarial: ");
			int id = sc.nextInt();
			Employee emp = list.stream().filter(x -> x.getId() ==  id).findFirst().orElse(null);
				if(emp == null) {
					System.out.println("Este id não está cadastrado!");
				} else {
					System.out.print("Entre com a porcentagem: ");
					double precentage = sc.nextDouble();
				}
				
				System.out.println();
					
			
			
			System.out.println("\nLista de funcionário:");
			for(Employee x : list) {
				System.out.println(x);
			}
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}

}
