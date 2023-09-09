import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numUm = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numDois = scanner.nextInt();

        try{
            contador(numUm, numDois);
        } catch(ParametrosInvalidosException e) {
            System.out.println("\nO primeiro número deve ser MENOR que o segundo.");
        }
    }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(!(parametroUm < parametroDois)) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int x = 0; x < contagem; x++) {
            System.out.println("Imprimindo o número: " + (x + 1));
        }
    }


}