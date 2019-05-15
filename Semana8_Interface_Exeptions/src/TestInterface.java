import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner input = new Scanner(System.in); 
		//RETANGULO	
		System.out.println("De a altura do retangulo: ");
		double h = input.nextDouble();
		System.out.println("De a largura do retangulo: ");
		double l = input.nextDouble();
			
		Retangulo ret = new Retangulo(h,l);//Altura e largura do Retangulo
		System.out.println("Informações do retangulo ");
		System.out.println("Area: " + ret.getArea());
		ret.print();
		System.out.println("Perimetro: " + ret.getPerimetro());
		
		System.out.println("=======================================");
		
		//TRIANGULO
		System.out.println("De a altura do triangulo: ");
		double a = input.nextDouble();
		System.out.println("De a base do triangulo: ");
		double b = input.nextDouble();
		System.out.println("De o lado1 do triangulo: ");
		double l1 = input.nextDouble();
		System.out.println("De o lado2 do triangulo: ");
		double l2 = input.nextDouble();
		
		System.out.println("Informações do triangulo");
		Triangulo tri = new Triangulo(a, b, l1, l2);//Altura, base, lado 1 e lado 2 do Triangulo
		System.out.println("Area: " + tri.getArea());
		tri.print();
		System.out.println("Perimetro: " + tri.getPerimetro());
		
		
		System.out.println("=======================================");
		
		//CIRCULO
		System.out.println("De o raio do circulo: ");
		double r = input.nextDouble();
		
		System.out.println("Informações do circulo");
		Circulo cir = new Circulo(r);//Raio do Circulo
		System.out.println("Area: " + cir.getArea());
		cir.print();
		System.out.println("Perimetro: " + cir.getPerimetro());
		
		input.close();//Fechando input
		}
		//TRATAMENTO DE ERROS
		catch(InputMismatchException e1){
			
			System.out.println("Somente números");
			
		}
		catch(Exception e2){
			System.out.println("");
		}
		finally{
			System.out.println("Fim de código!!!");
		}
		
		
	}

}
