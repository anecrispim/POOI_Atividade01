package atividades1;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
        System.out.print("Informe o peso da pesca: ");
		float peso = entrada.nextFloat();
		
		float excesso = peso - 50;
		float multa = 0;
		if (excesso > 0) {
			multa = excesso * 4;
		} 
		
		System.out.println("O excesso de peso foi de "+ excesso + " kg");
		System.out.println("A multa a pagar é de R$ "+ multa);
		entrada.close();
	}

}
