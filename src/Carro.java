public class Carro {
    public String descricao;
    public String marca;
    public String modelo;
    public int ano;


    public Carro( String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano= ano;
    }

    public void mostrarInformacoes(){
        System.out.println("Descricao: "+ descricao);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("ano: "+ ano);
    }
}

