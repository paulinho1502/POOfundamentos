public class ContaBancaria {
    public String titular;
    private double saldo;

public double getSaldo(){
    return saldo;
}
    // Metodos
    public void depositar(double valor){
//        saldo = saldo + valor;
        saldo += valor;
        // -=, *=, /=

    }
    public void sacar(double valor){
        System.out.println("saldo antigo: "+ saldo);
        saldo -= valor;
    }

public ContaBancaria(String titular,double saldo){
    this.titular = titular;
    this.saldo = saldo;

}





    public void exibirdados(){
        System.out.println("titular: " + titular);
        System.out.println("novo saldo: "+ saldo);

    }

}
