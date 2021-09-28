package bytebank;

public class TesteClasses {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1111, 1111);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 2222);
		
		System.out.println("SALDO CC: " + cc.getSaldo());
		System.out.println("SALDO CP: " + cp.getSaldo());
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		System.out.println("SALDO CC: " + cc.getSaldo());
		System.out.println("SALDO CP: " + cp.getSaldo());
		
		cc.depositar(5000);
		System.out.println("SALDO CC: " + cc.getSaldo());
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registraTributo(cc);
		System.out.println(ci.getTotalImposto());
		System.out.println("SALDO CC: " + cc.getSaldo());
	}

}
