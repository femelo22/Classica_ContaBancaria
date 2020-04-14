package ContaMultipla;

public class Conta {
	//ATRIBUTOS DA CLASSE CONTA
		private int numero;
		private String titular;
		private double saldo;
		static int qtdcontas = 0; //toda instancia compartilha o mesmo valor do atributo, USADO PARA AUTOINCREMENTAR
		
		//método construtor
		public Conta(String pTitular){
			this.titular = pTitular;
			qtdcontas++; //faz o auto-incremento com os as quantidades de contas
			this.numero = qtdcontas;
			this.saldo = 0;
		}
		
		//método onde os dados da conta serão apresentados
		public void DadosBancarios() {
			System.out.println("");
			System.out.println("-- DADOS BANCÁRIOS --");
			System.out.println("");
			System.out.println("Número: " + this.numero);
			System.out.println("Titular: " + this.titular);
			System.out.println("Saldo: " + this.saldo);
			System.out.println("");
			System.out.println("--- FIM DOS DADOS BANCÁRIOS ---");
			System.out.println("");
		}
		
		//MÉTODO PARA DEPOSITAR $
		public void Depositar(double pValor){
			System.out.println("");
			System.out.println("--- REALIZANDO DEPÓSITO ---");
			System.out.println("");
			System.out.println("Saldo Anterior: " + this.saldo);
			
			this.saldo += pValor; //this.saldo = this.saldo + pValor
			
			System.out.println("Saldo Atual: " + this.saldo);
			System.out.println("");
			System.out.println("--- FIM DO DEPÓSITO ---");
			System.out.println("");
		}
		
		//MÉTODO PARA SACAR $
		public void Sacar(double pValor) {
			System.out.println("");
			System.out.println("--- REALIZANDO SAQUE ---");
			System.out.println("");
			System.out.println("- Saldo Anterior: " + this.saldo);
			
			//verifica se o valor é para sacar é MENOR que o saldo
			if(pValor <= this.saldo) {//CASO TENHA SALDO
				this.saldo -= pValor;
				System.out.println("- Saldo Atual: "+ this.saldo);
			}
			else {//CASO NÃO TENHA SALDO
				System.out.println("- Saldo Insuficiente - ");
			}
			System.out.println("");
			System.out.println("--- FIM DO SAQUE ---\n");
		}
		
		//MÉTODO PARA TRANSFERIR DINHEIRO 
		public void Transferir(Conta pDest, double pValor){
			System.out.println("");
			System.out.println("--- REALIZANDO TRANSFERENCIA ---");
			System.out.println("Saldo Anterior Origem: "+ this.saldo);
			System.out.println("Saldo Anterior Destino: " + pDest.saldo);
			
			//verifica se o valor é para sacar é MENOR que o saldo
			if(pValor <= this.saldo) {//CASO TENHA SALDO
				
				this.saldo -= pValor;
				pDest.saldo += pValor;
				
				System.out.println("Saldo Atual Origem: "+ this.saldo);
				System.out.println("Saldo Atual Destino: " + pDest.saldo);
				
			}
			else {//CASO NÃO TENHA SALDO
				System.out.println("- Saldo Insuficiente");
			}
			System.out.println("--- FIM DA TRASFERENCIA ---\n");
			System.out.println("");
		}
}
