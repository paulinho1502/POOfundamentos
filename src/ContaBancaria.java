public class ContaBancaria {
    public String titular;
    public double saldo;


    // Metodos
    public void depositar(double valor){
//        saldo = saldo + valor;
        saldo += valor;
        // -=, *=, /=

    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void exibirdados(){
        System.out.println("titular: " + titular);
        System.out.println("saldo: "+ saldo);
    }

}
