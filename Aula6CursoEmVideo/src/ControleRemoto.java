
public class ControleRemoto implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto()
	{
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	

private int getVolume() {
	return volume;
}
private void setVolume(int volume) {
	this.volume = volume;
}
private boolean isLigado() {
	return ligado;
}
private void setLigado(boolean ligado) {
	this.ligado = ligado;
}
private boolean isTocando() {
	return tocando;
}
private void setTocando(boolean tocando) {
	this.tocando = tocando;
}


@Override
public void ligar() {
	// TODO Auto-generated method stub
	this.setLigado(true);
}


@Override
public void desligar() {
	// TODO Auto-generated method stub
	this.setLigado(false);
}


@Override
public void abrirMenu() {
	// TODO Auto-generated method stub
	System.out.println("|||MENU|||");
	System.out.println("Está ligado? " + this.isLigado());
	System.out.println("Está tocando? " + this.isTocando());
	System.out.print("Volume: " + this.getVolume());
	for(int i = 0; i<= this.getVolume();i+=10)
		System.out.print("|");
	System.out.print("|");
}


@Override
public void fecharMenu() {
	// TODO Auto-generated method stub
	System.out.println("Fechando Menu...");
}


@Override
public void maisVolume() {
	// TODO Auto-generated method stub
	if(this.isLigado())
		this.setVolume(this.getVolume() + 5);
	else System.out.println("Imposssivel aumentar volume");
}


@Override
public void menosVolume() {
	// TODO Auto-generated method stub
	if(this.isLigado())
		this.setVolume(this.getVolume() - 5);
	else System.out.println("Impossivel diminuir volume");
}


@Override
public void ligarMudo() {
	// TODO Auto-generated method stub
	if(this.isLigado() && this.getVolume() > 0)
		this.setVolume(0);
}


@Override
public void desligarMudo() {
	// TODO Auto-generated method stub
	if(this.isLigado() && this.getVolume() == 0)
		this.setVolume(50);
}


@Override
public void play() {
	// TODO Auto-generated method stub
	if (this.isLigado() && (!isTocando()))
		this.setTocando(true);
	else System.out.println("Nao foi possivel reproduzir");
}


@Override
public void pause() {
	// TODO Auto-generated method stub
	if(this.isLigado() && (this.isTocando()))
		this.setTocando(false);
	else System.out.print("Nao foi possivel pausar");
}

}
