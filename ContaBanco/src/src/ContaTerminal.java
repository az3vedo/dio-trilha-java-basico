package src;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String args[]) {
		// Declaração dos dados da conta
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		// Inicializar o scanner para receber as informações através da entrada do usuário
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		
		System.out.println("Programa: Por favor, digite o número da conta");
		numeroConta = scanner.nextInt();
		
		System.out.println("Programa: Por favor, digite o número da agência");
		agencia = scanner.next();
		
		System.out.println("Programa: Por favor, insira o seu nome");
		nomeCliente = scanner.next();
		
		System.out.println("Programa: Por favor, insira o saldo da conta");
		saldo = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeCliente, agencia, numeroConta, saldo));
		
		System.exit(0);
	}
}
