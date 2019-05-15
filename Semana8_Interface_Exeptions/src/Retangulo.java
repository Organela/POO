
public class Retangulo implements IShape,IShow {
	
	private double altura, largura;
	
	
	
	public Retangulo(double altura, double largura) {
	
		this.altura = altura;
		this.largura = largura;
	}


	@Override
	public double getArea(){
		
		return this.altura * this.largura;
		
	}



	@Override
	public void print() {
		System.out.println("Altura: "+ this.altura + " Largura: " + this.largura);
		
	}


	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.altura*2 +this.largura*2;
	}

}
