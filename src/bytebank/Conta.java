package bytebank;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		System.out.println("Bem-vindo ao Bytebank");
	}
	
	public abstract void depositar(double valor);
	
	public boolean sacar(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean transferir(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			
			sacar(valor);
			destino.depositar(valor);
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}
