public class Carro2 extends Veiculo{
    public int numeroDeporta;

    public Carro2 (String marca,int numeroDeporta){
        super(marca);
        this.numeroDeporta = numeroDeporta;

    }

    public void exibircarro(){
        System.out.println("Carro: "+ marca + "numero de portas: "+ numeroDeporta);
    }
}
