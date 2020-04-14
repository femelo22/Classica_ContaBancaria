package ContaMultipla;

import java.util.ArrayList;
import java.util.Scanner;

import ContaBancaria.Conta;

public class contasmultiplas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);//entrada de dados vindo do Teclado
		String aux;
		int opcao, numero, numero2;
		double valor;
		//implementação de lista
		ArrayList<Conta> lc = new ArrayList<Conta>();
		
		Conta c1, c2; //instanciar uma conta a partir do C1
		
		//Contruir o Menu
		do {
			System.out.println("");
			System.out.println("-- MENU --");
			System.out.println("1) Criar Conta");
			System.out.println("2) Dados Bancários");
			System.out.println("3) Depósito");
			System.out.println("4) Saque");
			System.out.println("5) Trasferencia");
			System.out.println("0) Sair");
			
			System.out.print("Opção: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome do titular: ");
				aux = entrada.nextLine();
				
				c1 = new Conta(aux);//cria uma nova instancia
				lc.add(c1);//joga a conta para a lista
				
				System.out.println("Conta criada com sucesso!");
				break;
				
			case 2:
				System.out.println("Número da conta: ");
				numero = entrada.nextInt();
				
				c1 = lc.get(numero - 1);//busca o número da conta pelo índice
				c1.DadosBancarios();
				break;
				
			case 3:
				System.out.println("Número da conta: ");
				numero = entrada.nextInt();
				c1 = lc.get(numero - 1);
				
				System.out.println("Digite o valor do depósito: ");
				valor = entrada.nextDouble();
				c1.Depositar(valor);
				break;
			
			case 4:
				System.out.println("Número da conta: ");
				numero = entrada.nextInt();
				c1 = lc.get(numero - 1);
				
				System.out.println("Digite o valor do saque: ");
				valor = entrada.nextDouble();
				c1.Sacar(valor);
				break;
				
			case 5:
				System.out.println("Número da conta de Origem: ");
				numero = entrada.nextInt();
				c1 = lc.get(numero - 1);
				
				System.out.println("Número da conta de Destino: ");
				numero2 = entrada.nextInt();
				c2 = lc.get(numero2 - 1);
				
				
				System.out.println("Digite o valor da Trasferencia: ");
				valor = entrada.nextDouble();
				
				c1.Transferir(c2, valor);
				break;
				
			default:
				if(opcao != 0)
				System.out.println("Opção invalida !");
				break;

			}
			
			System.out.println("");
			
		}while(opcao != 0);{
			System.out.println("Seção Finalizada");
		}
		
		entrada.close();
	}
}
