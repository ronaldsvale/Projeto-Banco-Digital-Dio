package com.bancodigital;

public class Metodo {
	public static void main(String[] args) {
		Cliente julia = new Cliente();
		julia.setNome("Julia");
		
		Cliente ronald = new Cliente();
		ronald.setNome("Ronald");

		Conta cc = new ContaCorrente(julia);
		Conta poupanca = new ContaPoupanca(ronald);

		cc.depositar(10000);
		cc.transferir(10000, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
