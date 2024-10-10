package Classes;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.tipo = "Conta Poupança";
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("###  Extrato Conta Poupança  ###");
		super.imprimirInfosComuns();
		}
	
}
