package avaliarcarros.src.service;

import java.util.ArrayList;

import avaliarcarros.src.model.Carro;

public class CarroService {

    ArrayList<Carro> carros = new ArrayList<>();

    public CarroService(String nomeCarro){
        carros.add(new Carro(nomeCarro));
    }

    public void adicionarCarro(String nome) {
        carros.add(new Carro(nome));
    }

    public void adicionarPontoPositivo(int posicao, String ponto) {

        carros.get(0).setPontosPositivos(ponto);
    }

    public void adicionarPontoNegativo(String ponto) {
        carros.get(0).setPontosNegativos(ponto);
    }

    public void removerPontoPositivo(int posicao) {
        carros.remove(posicao);
    }

    public void removerPontoNegativo(int posicao) {
        carros.remove(posicao);
    }

    public void mostrarPontos(int posicao) {
        System.out.println(carros.get(posicao).getPontosNegativos());
        System.out.println(carros.get(posicao).getPontosPositivos());
    }

    public void mostrarCarros(){
        System.out.println(carros);
    }

}