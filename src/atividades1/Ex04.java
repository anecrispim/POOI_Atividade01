package atividades1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		System.out.print("Informe a quarta nota: ");
		float nota4 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média: " + media);
		
		entrada.close();
	}

}
