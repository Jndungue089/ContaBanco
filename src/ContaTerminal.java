import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Por favor, digite o número da agência: ");
            numero = scanner.nextInt();
            System.out.println("Por favor, digite o nome da agência: ");
            agencia = scanner.next();
            System.out.println("Por favor, digite o valor a depositar: ");
            saldo = scanner.nextDouble();
            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.next();

            System.out.println("Olá "+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}