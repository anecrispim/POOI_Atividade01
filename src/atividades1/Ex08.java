package atividades1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto voc� ganha por hora: ");
		float valorH = entrada.nextFloat();
		
		System.out.print("Informe quantas horas voc� trablha por m�s: ");
		float mesH = entrada.nextFloat();
		
		float salario = mesH * valorH;
		
		System.out.println("Salario: R$ " + salario);
		entrada.close();
	}

}
