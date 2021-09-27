package bytebank;

public class ContaPoupanca extends Conta {
	
	ContaPoupanca(int agencia, int numero){
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

}
