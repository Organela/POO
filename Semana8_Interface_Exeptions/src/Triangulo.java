
public class Triangulo implements IShape, IShow{

	private double altura, base,l1,l2;	
	
	
	
	
	
	public Triangulo(double altura, double base, double l1, double l2) {
		
		this.altura = altura;
		this.base = base;
		this.l1 = l1;
		this.l2 = l2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Altura: "+ this.altura + " Base: " + this.base + " Lado 1: " + this.l1 + " Lado2: " + this.l2);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.altura* this.base)/2;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.base + this.l1 + this.l2;
	}

}
