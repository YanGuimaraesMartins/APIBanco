package Classes;

public class Main {
	public static void main(String[] args) {
		
		Cliente yan = new Cliente();
		yan.setNome("Yan");
		
		Banco bb = new Banco();
		bb.setNome("Banco do Brasil");
		
		Conta cc = bb.addCC(yan);
		Conta cp = bb.addCP(yan);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		bb.showClients();
		
		
	}

}
