import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitação dos dados via terminal
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do teclado

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        // Exibição da mensagem de saudação com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "Sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + " já está disponível para saque.");

        sc.close();
    }
}

