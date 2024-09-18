import java.util.Scanner;

/**
 * Classe principal do programa ContaBanco.
 * 
 * Responsável por coletar informações da conta bancária do usuário via terminal
 * e exibir uma mensagem de confirmação com os dados inseridos.
 */
public class ContaTerminal {

    /**
     * Método principal do programa.
     * 
     * @param args Argumentos de linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do terminal.
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que digite o número da agência.
        System.out.print("Por favor, digite o número da Agência: ");
        // Lê a agência digitada pelo usuário como uma String.
        String agencia = input.nextLine();

        // Solicita ao usuário que digite o número da conta.
        System.out.print("Por favor, digite o número da Conta: ");
        // Lê o número da conta digitado pelo usuário como um inteiro.
        int numero = input.nextInt();
        // Consome a quebra de linha restante no buffer após ler o inteiro.
        input.nextLine(); 

        // Solicita ao usuário que digite o nome do cliente.
        System.out.print("Por favor, digite o nome do Cliente: ");
        // Lê o nome do cliente digitado pelo usuário como uma String.
        String nomeCliente = input.nextLine();

        // Solicita ao usuário que digite o saldo inicial.
        System.out.print("Por favor, digite o Saldo inicial: ");
        // Lê o saldo inicial digitado pelo usuário como um double.
        double saldo = input.nextDouble();
        // Consome a quebra de linha restante no buffer após ler o double.
        input.nextLine(); 

        // Exibe uma mensagem de confirmação com os dados da conta inseridos pelo usuário.
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o objeto Scanner para liberar recursos.
        input.close();
    }
}