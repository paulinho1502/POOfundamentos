// public class NOME {}
public class Produto {
    // 1. Atributo
    // publi  TIPO NOME;
    private  String nome;
    private double tamanho;
    private double preco;
    private String cor;
    private int umidade;
    private String marca;

    // GETTERS e SETTERS
    // GET - PEGAR
    public String getNome() {
        return nome;
    }
    // SER - DEFINIR, MUDAR
    public void setNome(String nome) {
        this.nome = nome;
    }



    // 2. Metodo
    public Produto(String nome, double preco, String marca, double tamanho) {
       this.nome = nome;
       this.preco = preco;
       this.marca = marca;
       this. tamanho = tamanho;
    }
    // Mostrar informacoes do produto

    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }

}
