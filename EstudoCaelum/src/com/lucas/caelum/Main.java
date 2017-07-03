package com.lucas.caelum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data(12, 02, 2017);
		Funcionario  f1 = new Funcionario(d1, "Lucas", "Teste", "14.789.55", 1300);
		
		f1.mostraInformacoes();
		
		
	}

}
