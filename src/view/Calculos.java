package view;


public class Calculos {
	private float n1,n2;
	private String operador;
		
	public float somar(float n1, float n2) {
		return n1+n2;
	}
	public float subtrair(float n1, float n2) {
		return n1-n2;
	}
	public float multiplicar(float n1, float n2) {
		return n1*n2;
	}
	public float dividir(float n1, float n2) {
		return n1/n2;
	}

	public float getN1() {
		return n1;
	}
	
	public float raizQuadrada(float n1) {
		return (float) Math.sqrt(n1);
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}
	public String getOperador() {
		return operador;
	}
	
	public void setOperador(String operador) {
		this.operador = operador;
	}
}
