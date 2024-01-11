import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente novaConta = new ContaCorrente();

        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String nomeTitular = sc.nextLine();
        novaConta.setTitular(nomeTitular);
        System.out.println("Is there na initial deposit (y/n)? ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            novaConta.deposito(depositoInicial);
            System.out.println("Account data: ");
            System.out.println("Account " + numeroConta + ", Holder: " + novaConta.getTitular() + ", Balance: " +
                    "$" + novaConta.getSaldo());

        } else {

            System.out.println("Account data: ");
            System.out.println("Account " + numeroConta + ", Holder: " + novaConta.getTitular() + ", Balance: " +
                    "$ " + novaConta.getSaldo());
        }

        System.out.println("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        novaConta.deposito(deposito);
        System.out.println("Updated account data: ");
        System.out.println("Account " + numeroConta + ", Holder: " + novaConta.getTitular() + ", Balance: $ " + novaConta.getSaldo());

        System.out.println("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        novaConta.saque(saque);
        System.out.println("Updated account data: ");
        System.out.println("Account " + numeroConta + ", Holder: " + novaConta.getTitular() + ", Balance: $ " + novaConta.getSaldo());
    }
}
