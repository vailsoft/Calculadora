package view;


public class Calculos {
	private double n1,n2;
	private String operador;
		
	public double somar(double n1, double n2) {
		return n1+=n2;
	}
	public double subtrair(double n1, double n2) {
		return n1-=n2;
	}
	public double multiplicar(double n1, double n2) {
		return n1*=n2;
	}
	public double dividir(double n1, double n2) {
		return n1/=n2;
	}

	public double getN1() {
		return n1;
	}
	
	public double raizQuadrada(double n1) {
		return (double) Math.sqrt(n1);
	}

	public double quadrado(double n1) {
		return (double) Math.pow(n1,2);
	}


	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	public String getOperador() {
		return operador;
	}
	
	public void setOperador(String operador) {
		this.operador = operador;
	}

}
