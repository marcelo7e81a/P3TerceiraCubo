package cubo;

public abstract class  Quadrado {
	private float lado;

	public Quadrado() {
		
	}

	public Quadrado(float lado) {
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	public float area() {
		return (float) Math.pow(lado, 2);
	}
	
	public float perimetro() {
		return(float) 4 * lado;
	}
	
	public void mostraDados() {
		System.out.println("lado: " + lado + "Area: " + area() + "Perimetro: " + perimetro());
	}
	

}
