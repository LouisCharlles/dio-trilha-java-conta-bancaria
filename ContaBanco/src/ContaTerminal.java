import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero_da_conta;
        String numero_da_agencia;
        String nome_cliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        numero_da_agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numero_da_conta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o nome do cliente:");
        nome_cliente = scanner.nextLine();

        System.out.println("Quanto de saldo o cliente possui?:");
        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá "+nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numero_da_agencia+", conta "+numero_da_conta+" e seu saldo R$"+saldo+" já está disponível para saque.");
        scanner.close();
    }
}
