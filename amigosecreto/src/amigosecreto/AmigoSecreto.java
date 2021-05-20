package amigosecreto;

import java.util.Random;
import java.util.Scanner;

public class AmigoSecreto {

	public static void main(String[] args) {
		
		String nome [] = new String[] {"João","Pedro","Jose","Carlos","Maria","Ines","Paulo","Henrique","Alex","Manoel"};
		String nome2[] = new String[10];
		System.out.print("Amigo Secreto");
		
		for (int i = 0 ; i<nome.length;i++) {
			
			nome2[i]=nome[i];
		}
		
		Scanner entrada = new Scanner(System.in);
		Random escolha = new Random();
		
		int index;
		int cont = 0;
		
		for(int i = 0; i<nome.length; i++) {
			
			System.out.print("\n\nFaltam fazer o sorteio: ");
			
			for(int x = 0 ;x < nome2.length; x++) {
				
				if(!nome2[x].equals("")) {
				
				System.out.print(nome2[x]+" | ");
				
				}
				
			}
			
			System.out.print("\n\nNomes que não foram sorteados: ");
			
			for(int x = 0 ;x < nome.length; x++) {
				
				if(!nome[x].equals("")) {
				
				System.out.print(nome[x]+" | ");
				
				}
				
			}
			
			System.out.print("\n\nSeu Nome>");
			
			String nomesorteador = entrada.nextLine();	
			
			if(nomesorteador.equals(nome2[i])) {
				
				nome2[i] = "";
				
			}
			
			for(int j = 0; j>=0;j++) {
				
				index = escolha.nextInt(10);
				
				if(index!=j && !nome[index].equals("")) {
					
					cont++;
					
					System.out.print(nomesorteador+" sorteou "+nome[index]);
					
					nome[index] = "";
					
					break;
					
				}else if(cont==10) {
					
					break;
					
				}
					
			}
			
		}	
			
	}
	
}
