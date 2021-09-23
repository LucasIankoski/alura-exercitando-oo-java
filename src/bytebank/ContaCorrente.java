package bytebank;

public class ContaCorrente extends Conta {
	
	ContaCorrente(int agencia, int numero){
		super(agencia,  numero);
	}

@Override
public boolean sacar(double valor) {
		
		double ValorAsacar = valor + 0.2;
		return super.sacar(ValorAsacar);
		
	}

}
