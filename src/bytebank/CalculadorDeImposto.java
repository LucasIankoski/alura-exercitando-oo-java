package bytebank;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registraTributo(Tributavel tributo) {
		double valor = tributo.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
