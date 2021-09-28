package bytebank;

public class ContaCorrente extends Conta implements Tributavel {
	
	ContaCorrente(int agencia, int numero){
		super(agencia,  numero);
	}

	@Override
	public boolean sacar(double valor) {
			
			double ValorAsacar = valor + 5;
			return super.sacar(ValorAsacar);
			
		}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		
		return 30.00;
	}

}
