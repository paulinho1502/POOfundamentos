public class Bicicleta extends Veiculo{

    public int numeroDeMarcha;
    public Bicicleta(String marca,int numeroDeMarcha) {
        super(marca);
        this.numeroDeMarcha = numeroDeMarcha;

    }

    public void exibirbicicleta(){
        System.out.println("Bicicleta: " + marca + "numero de marchas " + numeroDeMarcha);
    }


}
