package com.lucas.caelum3;

public class Pessoa {

	private String nome;
	private int idade;
	
	public void fazAniversario() {
		idade += 1;
	}
	
	public void mostra() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Idade: "+this.idade);
	}
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	// getter and setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
