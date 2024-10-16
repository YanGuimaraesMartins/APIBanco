package Classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	//retorno de sucesso ou falha
	public Conta addCC(Cliente c) {
		Conta cc = new ContaCorrente(c);
		this.contas.add(cc);
		return cc;
	}
	
	public Conta addCP(Cliente c) {
		Conta cp = new ContaPoupanca(c);
		this.contas.add(cp);
		return cp;
	}

	public void showClients() {
		if(this.contas.isEmpty()) {
			System.out.println("Não possui clientes cadastrados");
		} else {
			for (Conta conta : contas) {
				System.out.printf("Titular: %s | ", conta.cliente.getNome());
				System.out.printf("Tipo Conta: %s \n", conta.tipo);
			}
		}
	}
}
