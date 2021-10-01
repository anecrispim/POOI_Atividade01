package atividades1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um lado do quadrado: ");
		float l1 = entrada.nextFloat();
		
		System.out.print("Informe outro lado do quadrado: ");
		float l2 = entrada.nextFloat();
		
		float area = l1 * l2;
		
		System.out.println("A area do quadrado é de: " + area);
		entrada.close();
	}

}
