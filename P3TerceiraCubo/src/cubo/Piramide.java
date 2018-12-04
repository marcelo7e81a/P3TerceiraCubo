package cubo;

public class Piramide extends Quadrado {
	private float altura;

	public Piramide() {
		super();
		this.altura = 0;
	}

	public Piramide(float lado, float altura) {
		super(lado);
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float perimetro() {
		return 0;
	}

	public float alturaLado() {
		return (float) Math.sqrt(Math.pow(getLado(), 2) + Math.pow(altura, 2));
	}

	public float areaLateral() {
		return (float) 4 * (getLado() * alturaLado()) / 2;
	}

	public float area() {
		return (float) super.area() + areaLateral();
	}

	public float volume() {
		return super.area() * altura / 3;
	}

	public void mostrarDados() {
		System.out.println("lado: " + getLado() + "\nAltura: " + altura + "\nare base: " + super.area() + "\nperimentro base:"
				+ super.perimetro() + "\nalura lado:" + alturaLado() + "\narea lateral: " + areaLateral() + "\narea: " + area()
				+ "\nvolume: " + volume());

	}

}
