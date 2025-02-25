package data;
public class Pessoas {
    
    private String nome;
    private int idade;
    private double altura;

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString(){
        return nome + ", " + idade + " anos, " + altura + "m";
    }

    public static double alturaMedia(Pessoas[] pessoas){
        double soma = 0;
        for(int i = 0; i < pessoas.length; i++){
            soma += pessoas[i].getAltura();
        }
        return soma / pessoas.length;
    }

    public static String menorDe16(Pessoas[] pessoas){
        String nomes = "";
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                nomes += pessoas[i].getNome() + " ";
            }
        }
        return ((nomes.split(" ").length)  / (double)pessoas.length)*100 + "%" + "\n" + nomes;
    }
}
