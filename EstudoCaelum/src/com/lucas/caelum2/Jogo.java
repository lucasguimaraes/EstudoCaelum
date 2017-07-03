package com.lucas.caelum2;

import java.util.Scanner;

public class Jogo {

	private String nomeJogador;
	private int escolhaDoArtista;

	Scanner scan = new Scanner(System.in);
	Artista artista1 = new Artista("Michael Jackson", 0);
	Artista artista2 = new Artista("Justin Bieber", 0);
	Artista artista3 = new Artista("Ariana Grande", 0);
	Artista artista4 = new Artista("Miley Cirus", 0);

	public void iniciarJogo() {
		System.out.println("Bem vindo ao jogo do Vota Vota!");
		System.out.print("Digite seu nome: ");
		nomeJogador = scan.nextLine();
		System.out.println(nomeJogador + ", escolha seu artista preferido.");
		System.out.println("*****************************************");
		System.out.println("1- " + artista1.getNomeArtista());
		System.out.println("2- " + artista2.getNomeArtista());
		System.out
				.print("Digite 1 para " + artista1.getNomeArtista() + " ou 2 para " + artista2.getNomeArtista() + ": ");

		escolhaDoArtista = scan.nextInt();

		if (escolhaDoArtista == 1) {
			artista1.receberVotos();
		} else if (escolhaDoArtista == 2) {
			artista2.receberVotos();
		}

		System.out.println("*****************************************");

		System.out.println("1- " + artista3.getNomeArtista());
		System.out.println("2- " + artista4.getNomeArtista());
		System.out
				.print("Digite 1 para " + artista3.getNomeArtista() + " ou 2 para " + artista4.getNomeArtista() + ": ");

		escolhaDoArtista = scan.nextInt();

		if (escolhaDoArtista == 1) {
			artista3.receberVotos();
		} else if (escolhaDoArtista == 2) {
			artista4.receberVotos();
		}
	}

	public void finalizarJogo() {
		System.out.println("*****************************************");
		System.out.println("Contagem de votos: ");
		System.out.println(artista1.getNomeArtista() + " - " + artista1.getPontuacaoArtista());
		System.out.println(artista2.getNomeArtista() + " - " + artista2.getPontuacaoArtista());
		System.out.println(artista3.getNomeArtista() + " - " + artista3.getPontuacaoArtista());
		System.out.println(artista4.getNomeArtista() + " - " + artista4.getPontuacaoArtista());
	}

}
