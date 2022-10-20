package contabanco;

public class ContaBanco {
	

	public static void main(String[]args) {
	ContaBanco cb=new ContaBanco();
    cb.setNumConta(4200);
	cb.setDono("Patrick");
	cb.abrirconta("cc");
	
	
	ContaBanco cb2=new ContaBanco();
	cb2.setNumConta(4400);
	cb2.setDono("Greicy");
	cb2.abrirconta("cp");
	
	cb.depositar(200);
	cb2.depositar(400);
	
	cb.sacar(50);
	cb2.sacar(100);
	
	
	cb.estadoatual();
	cb2.estadoatual();
	
	

	}
	
	public void estadoatual() {
		System.out.println("-------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
	    System.out.println("Saldo: " + this.getSaldo());	
		System.out.println("Status: " + this.getStatus());
		}
	
	
	public int numconta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
    public String cc;
    public String cp;
	
	
    
	
 public void abrirconta(String t) {
	setTipo(t);
	if (t=="cc") { 
		getStatus();
		setSaldo(50);
		System.out.println("Conta aberta com sucesso!");

	}else if(t=="cp") {
		getStatus();
		setSaldo(150);	
		
	}
	
	
}

public void fecharconta() {
	if(this.getSaldo()>0) {
		System.out.println("A conta não pode ser fechada, pois ainda há dinheiro ");
	}else if(this.getSaldo()<0) {
		System.out.println("A conta não pode ser fechada, pois ainda está em débito");
	}else {
		setStatus(false);
		System.out.println("A conta foi fechada com sucesso!");
	}
	
}

public void depositar(float v) {
	if (this.getStatus()) {
	this.setSaldo(this.getSaldo()+v);
	System.out.println("Deposito realizado com sucesso!");
	System.out.println("Valor depositado na conta " +getDono());
	}else {
		System.out.println("Impossível depositar,você não tem uma conta aberta");
	}
	
}

public void sacar(float v) {
	if(status==true) 
	if(this.getSaldo()>=v) {
	this.setSaldo(this.getSaldo()-v);
	System.out.printf( " Saque realizado com sucesso " + " Valor disponivel:%.2f", saldo);
	}else { 
	System.out.println("Saldo Insuficiente");
	}
else 
	System.out.println("Impossível sacar de uma conta fechada");
}


public void pagarmensal() {
 int v=0;
 if(tipo==cc) {
	 v=12;
 }else if(tipo==cp) {
	 v=20;}
if(getStatus()) {
	
}	
if(saldo>v) { 
setSaldo(getSaldo()-v);
System.out.println("Mensalidade paga com sucesso"+getDono());

}else 
System.out.println("Impossível pagar uma conta fechada");
}


public ContaBanco() {
this.saldo=0;
setStatus(true);
abrirconta(tipo);
this.setTipo(cp);

}

public void setNumConta(int n) { 
	this.numconta=n;
}

public int getNumConta() {
	return this.numconta;
}

public void setTipo(String t) {
	this.tipo=t;
}

public String getTipo() {
	return this.tipo;
}

public void setDono(String d) {
	this.dono=d;
}

public String getDono() {
	return this.dono;
}

public void setSaldo(float s) {
	this.saldo=s;
	
}

public float getSaldo() {
	return this.saldo;
}

public void setStatus(boolean st) {
	this.status=st;
}

public boolean getStatus() {
	return this.status;
}



}

