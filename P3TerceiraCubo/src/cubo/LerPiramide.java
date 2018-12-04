package cubo;

import java.util.Scanner;

public class LerPiramide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Piramide p = new Piramide(0, 0);
		
		System.out.println("Informe lado");
			p.setLado(sc.nextFloat());
		while (p.getLado()!=0) {
			
			System.out.println("Digite a altura");
			p.setAltura(sc.nextFloat());
			
			p.mostrarDados();
			
			System.out.println("");
			System.out.println("Digite o lado: ");
			p.setLado(sc.nextFloat());
			
		}
		
	}

}
