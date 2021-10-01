package atividades1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da area a ser pintada em metros quadrados: ");
		double metros = entrada.nextDouble();
		
		double quantidade = Math.ceil((metros / 3) / 18);
		double preco = quantidade * 80;
		
		System.out.println("Quantidade de latas necessarias: " + quantidade);
		System.out.println("Prço Total: R$ " + preco);
		
		entrada.close();
	}

}
