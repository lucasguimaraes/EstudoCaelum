package com.lucas.caelum4;

public class Casa {
	private String cor;
	private int totalDePortas;
	private Porta[] portas;
//	private boolean porta1; // true aberta, false fechada
//	private boolean porta2;
//	private boolean porta3;

	public void pintaCasa(String corEscolhida) {
		this.cor = corEscolhida;
	}
	
	/*public String quaisPortasAbertas() {
		String contador = null;

		if (porta1 == true) {
			contador = "2 e 3";
		}
		if (porta2 == true) {
			contador = "1 e 3";
		}

		if (porta3 == true) {
			contador = "1 e 2";
		}

		if (porta1 && porta2) {
			contador = "3";
		}

		if (porta1 && porta3) {
			contador = "2";
		}

		if (porta2 && porta3) {
			contador = "1";
		}

		return contador;

	}*/
	
	public int quantasPortasEstaoAbertas() {
		int contador = 0;
		for(int i = 0; i < portas.length; i++) {
			if(portas[i].isAberto) {
				contador++;
			}
		}
		return contador;
	}
	
	public void adicionaPorta(Porta porta) {
		Porta[] portasAux = this.portas;
		if(this.totalDePortas == 0) {
			this.portas = new Porta[1];
		} else {
			this.portas = new Porta[this.totalDePortas+1];
			for(int i = 0; i < portasAux.length ; i ++) {
				if(portasAux[i] == null) {
					portas[i] = porta;
				}
			}
		}
		
		for(int i = 0; i < this.portas.length ; i ++) {
			if(this.portas[i] == null) {
				this.portas[i] = porta;
			}
		}
	}
/*
	public int quantasPortasAbertas() {
		int contador = 0;
		if (porta1 == true) {
			contador++;
		}
		if (porta2 == true) {
			contador++;
		}
		if (porta3 == true) {
			contador++;
		}
		return contador;
	} */

	/*public void fechaPortaEscolhida(int qualPorta) {
		if (qualPorta == 1) {
			porta1 = false;
		} else if (qualPorta == 2) {
			porta2 = false;
		} else if (qualPorta == 3) {
			porta3 = false;
		}
	}*/

/*	public void abrePortaEscolhida(int qualPorta) {
		if (qualPorta == 1) {
			porta1 = true;
		} else if (qualPorta == 2) {
			porta2 = true;
		} else if (qualPorta == 3) {
			porta3 = true;
		}
	}*/

	

	public String getCor() {
		return cor;
	}

	public Casa(String cor, int totalDePortas, Porta[] portas) {
		super();
		this.cor = cor;
		this.totalDePortas = totalDePortas;
		this.portas = portas;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTotalDePortas() {
		return totalDePortas;
	}

	public void setTotalDePortas(int totalDePortas) {
		this.totalDePortas = totalDePortas;
	}

	public Porta[] getPortas() {
		return portas;
	}

	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	
}
