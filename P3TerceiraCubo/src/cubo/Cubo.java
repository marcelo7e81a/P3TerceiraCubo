package cubo;

public class Cubo extends Quadrado{

	
	
	public Cubo() {
		super();
		
	}

	public Cubo(float lado) {
		super(lado);
		
	}

	public float perimetro() {
		return 0;
	}
	
	public float area() {
		return (float) 6 * super.area() * getLado();
	}
	
	public float volume() {
		return super.area() * getLado();
	}
	
	public void mostraDados() {
		System.out.println("lado: " + getLado() + "Area: " + area() + "Volume: " + volume());
		
	}

}
