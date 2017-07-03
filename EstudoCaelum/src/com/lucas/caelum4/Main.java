package com.lucas.caelum4;import java.util.Scanner;

import javax.lang.model.element.QualifiedNameable;

public class Main {

	public static void main(String[] args) {
		
		Casa casa1 = new Casa(null, false, false, false);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Escolha a cor da casa: ");
		casa1.setCor(scan.nextLine());
		System.out.println("***************************************");
		System.out.println("Vamos brincar de abrir e fechar portas. ");
		System.out.println("Cor da casa: " +casa1.getCor());
		System.out.println("A casa tem a porta 1, 2 e 3.");
		

			System.out.print("Qual porta deseja abrir? : ");
			casa1.abrePortaEscolhida(scan.nextInt());
			System.out.println("Porta aberta.");
			System.out.println("Sobraram as portas "+casa1.quaisPortasAbertas());
			System.out.print("Qual porta deseja abrir? : ");
			casa1.abrePortaEscolhida(scan.nextInt());
			System.out.println("Sobrou a porta "+casa1.quaisPortasAbertas());
			
			
		
		/*casa1.abrePortaEscolhida(1);
		casa1.abrePortaEscolhida(2);
		casa1.abrePortaEscolhida(3);
		casa1.fechaPortaEscolhida(2);
		//casa1.fechaPortaEscolhida(1);
		System.out.println("Quantas portas abertas: " +casa1.quantasPortasAbertas());*/

	}

}
