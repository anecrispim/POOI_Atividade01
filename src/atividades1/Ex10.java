package atividades1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um primeiro número inteiro: ");
		int iNum1 = entrada.nextInt();
		
		System.out.print("Informe um segundo número inteiro: ");
		int iNum2 = entrada.nextInt();
		
		System.out.print("Informe um terceiro número real: ");
		double dNum3 = entrada.nextDouble();
		
		double produto = (iNum2 / 2.0) * (iNum1 * 2);
		double soma =  (iNum1 * 3) + dNum3;
		double elevado = Math.pow(dNum3, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("O terceiro elevado ao cubo: " + elevado);
		
		entrada.close();
	}

}
