package com.lucas.caelum;

public class Funcionario {

	private Data dataDeEntrada;
	private String nomeFuncionario;
	private String departamentoFuncionario;
	//private String dataDeEntradaNoBanco;
	private String rgDoFuncionario;
	private double salarioFuncionario;
	
	
	public Funcionario(Data dataDeEntrada, String nomeFuncionario, String departamentoFuncionario,
			String rgDoFuncionario, double salarioFuncionario) {
		super();
		this.dataDeEntrada = dataDeEntrada;
		this.nomeFuncionario = nomeFuncionario;
		this.departamentoFuncionario = departamentoFuncionario;
		this.rgDoFuncionario = rgDoFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}

	public void mostraInformacoes() {
		System.out.print("Nome: " +getNomeFuncionario());
		System.out.println("\t\t Departamento: " +getDepartamentoFuncionario());
		System.out.println("");
		System.out.print("RG: " +getRgDoFuncionario());
		System.out.println("\t Salário: " +getSalarioFuncionario());
		System.out.println("");
		System.out.println("Data de Entrada no Banco: " +getDataDeEntrada().getDataFormatada());
		System.out.println("");
		System.out.println("");
	}
	
	public void recebeAumento(double aumentaSalario) {
		this.salarioFuncionario += aumentaSalario; 
	}
	
	public double calculaGanhoAnual() {
		return this.salarioFuncionario * 12;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getDepartamentoFuncionario() {
		return departamentoFuncionario;
	}

	public void setDepartamentoFuncionario(String departamentoFuncionario) {
		this.departamentoFuncionario = departamentoFuncionario;
	}

	public String getRgDoFuncionario() {
		return rgDoFuncionario;
	}

	public void setRgDoFuncionario(String rgDoFuncionario) {
		this.rgDoFuncionario = rgDoFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}


	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}


	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	
	
	
	
	
}
