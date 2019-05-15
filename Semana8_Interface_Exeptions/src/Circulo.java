
public class Circulo implements IShape, IShow{

	private double raio;
	
	
	public Circulo(double raio) {
		
		this.raio = raio;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Raio: " + this.raio);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * (this.raio * this.raio);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * this.raio;
	}

}
