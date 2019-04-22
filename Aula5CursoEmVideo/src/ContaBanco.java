
public class ContaBanco {

public int numConta;
protected String tipo;
private String dono;
private float saldo;
private boolean status; // aberta ou fechada

public void estadoAtual()
{	System.out.println("-----------------------------");
	System.out.println("Conta: " + this.getNumConta());
	System.out.println("Tipo: " + this.getTipo());
	System.out.println("Dono: " + this.getDono());
	System.out.println("Saldo: " + this.getSaldo());
	System.out.println("Status: " + this.isStatus());
}

public ContaBanco() {
	this.status = false;
	this.saldo = 0;
	
}



public int getNumConta() {
	return numConta;
}



public void setNumConta(int numConta) {
	this.numConta = numConta;
}



public String getTipo() {
	return tipo;
}



public void setTipo(String t) {
	this.tipo = t;
}



public String getDono() {
	return dono;
}



public void setDono(String dono) {
	this.dono = dono;
}



public float getSaldo() {
	return saldo;
}



public void setSaldo(float saldo) {
	this.saldo = saldo;
}



public boolean isStatus() {
	return status;
}



public void setStatus(boolean status) {
	this.status = status;
}



public void abrirConta(String t ) {
	
	this.setTipo(t);
	this.setStatus(true);
	
	
	if(t == "cc")this.setSaldo(50);
	else
	if(t == "cp")this.setSaldo(150);
	System.out.println("Conta aberta com sucesso!!!");
}

public void fecharConta() {
	if(this.getSaldo() == 0) {
	this.setStatus(false);
	System.out.println("Conta fechada com sucesso!!!");
	}else { 
		if(this.getSaldo() < 0)System.out.println("A conta está em débito!!!");
		else
		System.out.println("A conta ainda tem saldo!Favor retirar saldo.");
		}
}

public void depositar(float valor) {
	if(this.isStatus()) {
	this.setSaldo(this.getSaldo() + valor );
	System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
	}else 
		System.out.println("Impossivel depositar em conta fechada!!!");
}

public void sacar(float valor) {
	if(this.isStatus() == true) {
		if(valor > this.getSaldo())System.out.println("Não foi possível completar saque!!");
		else {
			System.out.print("O saque realizado foi de: "+ valor);
			System.out.println(" Na conta de " + this.getDono());
			this.setSaldo(this.getSaldo() - valor);
		}
	}
}

public void pagarMensal() {
	if(this.isStatus() == true) {
	if(this.getTipo() == "cc")this.setSaldo(this.getSaldo() - 12);
	else
		if(this.getTipo() == "cp")this.setSaldo(this.getSaldo() - 20 );
		}
	}
}
