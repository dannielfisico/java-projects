package application;

import java.util.Scanner;

import entities.Estudante;

public class AppPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante[] estudante = new Estudante[10];
		
			System.out.print("How many rooms will be rented? ");
			int quantity = sc.nextInt();
			sc.nextLine();
			System.out.println();
			for(int i = 0; i < quantity; i++) {
				System.out.printf("Rent #%d%n",i+1);
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				sc.nextLine();
				System.out.println();
				estudante[room] = new Estudante(room, name, email); 
			};
			System.out.print("\033[H\033[2J");
			System.out.println("Busy rooms:");
			for(int i = 0; i < estudante.length; i++) {
				if(estudante[i] != null) {
					System.out.println(estudante[i]);
				} else {
					System.out.println(i + ": empty");
				}
			}
		
		
		
		
		sc.close();
	}

}
