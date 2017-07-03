package com.lucas.caelum2;

public class Artista {
	
	private String nomeArtista;
	private int pontuacaoArtista;
	
	public Artista(String nomeArtista, int pontuacaoArtista) {
		super();
		this.nomeArtista = nomeArtista;
		this.pontuacaoArtista = pontuacaoArtista;
	}
	
	public void verPontosAtual() {
		System.out.println("Pontos: " +getPontuacaoArtista());
	}
	
	public void receberVotos() {
		this.pontuacaoArtista++;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public int getPontuacaoArtista() {
		return pontuacaoArtista;
	}

	
	
	
	
}
