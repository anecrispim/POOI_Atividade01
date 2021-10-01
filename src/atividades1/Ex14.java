package atividades1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora: ");
		float valorH = entrada.nextFloat();
		
		System.out.print("Informe quantas horas você trablha por mês: ");
		float mesH = entrada.nextFloat();
		
		float salarioB = mesH * valorH;
		
		double inss = salarioB * 0.08;
		double ir = salarioB * 0.11;
		double sindicato = salarioB * 0.05;
		
		double salarioL = salarioB - inss - ir - sindicato;
		
		System.out.println("Salario Bruto: R$ " + salarioB);
		System.out.println("Valor de INSS descontado: R$ " + inss);
		System.out.println("Valor de sindicato descontdo: R$ " + sindicato);
		System.out.println("Valor de Imposto de Renda descontado: R$ " + ir);
		System.out.println("Salario Líquido: R$ " + salarioL);
		entrada.close();

	}

}
