import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente: ");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agency = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Por favor, digite o saldo: ");
        double amount = scanner.nextDouble();

        System.out.println("""
                Olá %s, obrigado por criar uma conta em nosso banco!
                Seu número de agência é: %s.
                O número da sua conta é: %d.
                Seu saldo atual é: R$ %.2f (e já está disponível para saque).
                """.formatted(clientName, agency, accountNumber, amount));
    }
}