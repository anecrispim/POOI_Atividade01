package atividades1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da area a ser pintada em metros quadrados: ");
		double metros = entrada.nextDouble();
		
		double quantidade18 = Math.ceil((metros / 6) / 18);
		double preco18 = quantidade18 * 80;
		
		double quantidade3 = Math.ceil((metros / 6) / 3.6);
		double preco3 = quantidade3 * 25;
		
		System.out.println("Comprando somente latas de 18 litros - Quantidade de latas necessarias: " + quantidade18);
		System.out.println("Comprando somente latas de 18 litros - Pr�o Total: R$ " + preco18);
		System.out.println("Comprando somente gal�es de 3,6 litros - Quantidade de latas necessarias: " + quantidade3);
		System.out.println("Comprando somente gal�es de 3,6 litros - Pre�o Total: R$ " + preco3);
		
		entrada.close();
	}

}
