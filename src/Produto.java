// public class NOME {}
public class Produto {
    // 1. Atributo
    // publi  TIPO NOME;
    public  String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int umidade;
    public String marca;

    // 2. Metodo
    // Mostrar informacoes do produto
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }

}
