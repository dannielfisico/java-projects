package application;

import java.util.Scanner;

import entities.HospedeHotel1;

public class AppHotel1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("##################################################");
		System.out.println("############## BEM VINDOS AO HOTEL 1 #############");
		System.out.println("##################################################");
		System.out.println();
		System.out.println("############### MENU PRINCIPAL ###################");
		HospedeHotel1[] hospede = new HospedeHotel1[10];
		char option = '0';
		do {
			System.out.println("\nVer quartos vagos (1)\nAlugar quartos (2)\nVer hospedes (3)");
			System.out.println();
			option = sc.next().charAt(0);
			sc.nextLine();
			  if(option == '1') {
				  System.out.println("Quartos Vagos");
					for(int i = 0; i < hospede.length; i++) {
						if(hospede[i] == null) {
							System.out.print(i + "-> Vago | ");
							if(i != 0 && i!=8 && i%4 == 0) {
								System.out.println();
							} 
						}
					}
					option = '0';
			  } else if (option == '2') {
				  System.out.println("Alugar quarto"); 
				  System.out.println("Nome: ");
				  String name = sc.nextLine();
				  System.out.println("E-mail: ");
				  String email = sc.nextLine();
				  System.out.println("Quarto: ");
				  int room = sc.nextInt();
				  	if(hospede[room] == null) {
				  		hospede[room] = new HospedeHotel1(room, name, email);				  		
				  		System.out.printf("\nQuarto %d liberado para o hospede %s.\n", room, name);
				  	} else {
				  		
				  		do {
				  			System.out.printf("\nQuarto %d ocupado.", room);
				  			System.out.println("\nEscolha outro quarto.");
				  			
				  			for(int i = 0; i < hospede.length; i++) {
				  				if(hospede[i] == null) {
				  					System.out.print(i + "-> Vago | ");
				  					if(i != 0 && i!=8 && i%4 == 0) {
				  						System.out.println();
				  					} 
				  				}
				  			}
				  			
				  			System.out.println("\nQuarto: ");
				  			room = sc.nextInt();
				  		}while(hospede[room] != null);
				  		
				  		hospede[room] = new HospedeHotel1(room, name, email);				  		
				  		System.out.printf("\nQuarto %d liberado para o hospede %s.\n", room, name);		  		
				  		option = '0';		  		
				  	}
						  
				  option = '0';
			  } else if(option == '3')  {
				  System.out.println("Quartos ocupados:");
				  boolean status = true;
				  for(int i = 0; i < hospede.length; i++) {
					  if(hospede[i] != null) {
						  System.out.println(hospede[i]);
						  status = false;
					  }
				  }
				  
				  if(status) {
					  System.out.println("Nenhum quarto ocupado");
				  }
				  option = '0';
			  } else {
				  System.out.println("Opção Inválida, tente novamente!");
				  option = '0';
				  
			  }
					  
		}while (option == '0');

		sc.close();

	}

}
