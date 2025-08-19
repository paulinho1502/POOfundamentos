public class Atleta extends Pessoa{


    private String esporte;



    public Atleta(String nome, String esporte) {
        super(nome);
        this.esporte = esporte;
    }

    public String getEsporte() {
        return esporte;
    }

    public void exibir (){
        System.out.println("Atleta: " + nome);
        System.out.println("Esporte: " + esporte);

    }
}
