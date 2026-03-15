package avaliarcarros.src.model;

import java.util.ArrayList;

public class Carro {
    
    private String nome;
    private ArrayList<String> pontosPositivos = new ArrayList<>();
    private ArrayList<String> pontosNegativos = new ArrayList<>();

    public Carro(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", pontosPositivos=" + pontosPositivos + ", pontosNegativos=" + pontosNegativos
                + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getPontosPositivos() {
        return pontosPositivos;
    }

    public void setPontosPositivos(String pontosPositivos) {
        this.pontosPositivos.add(pontosPositivos);
    }

    public ArrayList<String> getPontosNegativos() {
        return pontosNegativos;
    }

    public void setPontosNegativos(String pontosNegativos) {
        this.pontosNegativos.add(pontosNegativos);
    }
    
}