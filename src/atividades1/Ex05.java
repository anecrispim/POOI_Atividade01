package atividades1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor em metros: ");
		double metros = entrada.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println(metros + " m é igual a " + centimetros + " cm");
		entrada.close();
	}

}
