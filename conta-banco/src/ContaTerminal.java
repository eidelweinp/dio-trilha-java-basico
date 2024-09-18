/**
 * <h1>ContaTerminal</h1>
 * <p>A Conta Terminal permite criar uma nova conta em nosso banco.</p>
 * <b>Note:</b> Leia atentamente a documentação dessa classe para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Pollyana Eidelwein
 * @version 1.0
 * @since 18/09/2024 
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o código da sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o quanto tem no seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
        +agencia+", conta "+numeroConta+"e seu saldo "+saldo+" já está disponível para saque.");
    }
}
