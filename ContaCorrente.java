public class ContaCorrente {

    private int numeroDaConta;
    private String titular;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(int numeroDaConta, String titularDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titularDaConta;
        this.saldo = saldo;
    }

    public ContaCorrente(int numeroDaConta, String titularDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titularDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo = this.saldo - valor - 5;
    }

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

}