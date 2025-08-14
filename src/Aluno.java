public class Aluno {
    // nome e nota
    public String nome;
    public double nota;

    public void verificarStatus(){
        if(nota >= 7.0){
            System.out.println(nome + " foi Aprovado" );
        }else {
            System.out.println(nome + " foi Reprovado");
        }
    }

}
