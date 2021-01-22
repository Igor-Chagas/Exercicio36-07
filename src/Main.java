import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, entre com as coordenadas de x e de y, respectivamente:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		if (x >= 0.0 && y > 0.0) {
		System.out.println("Q1");	
		}	
		else if (x >= 0.0 && y <0.0) {
			System.out.println("Q4");
		}
		else if (y >= 0.0 && x < 0.0) {
			System.out.println("Q2");
		}	
		else if (y <= 0.0 && x < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Origem");
		}
		sc.close();	
		}

}


