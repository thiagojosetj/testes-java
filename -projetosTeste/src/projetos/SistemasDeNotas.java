package projetos;

public class SistemasDeNotas {

    private String nome;
    private int nota1, nota2, nota3;
    private double media;

    public SistemasDeNotas(String nome, int n1, int n2, int n3) {
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.media = (n1 + n2 + n3) / 3;
    }

    public String situacaoFinal(){
        if(this.media >= 6.0){
            return "Aprovado.";
        }else{
            return "Reprovado! Parabéns bonitão.";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }


    
}