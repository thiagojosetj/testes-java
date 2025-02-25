package entities;

public class Aluno {

    public double nota1, nota2, nota3;
    public String nome;

    public double notaTotal(){

        return nota1 + nota2 + nota3;

    }

    public String aprovado(){

        if(notaTotal() > 60.0){

            return "PASS";

        }else{

            return "FAILED" + "\n" + "missing " + String.format("%.2f", 60.0 - notaTotal()) + " points";
        }
    }

    public String toString(){

        return "Student: " + nome + "\n" +"Final grade: " + String.format("%.2f", notaTotal()) + "\n" + aprovado();

    }
}