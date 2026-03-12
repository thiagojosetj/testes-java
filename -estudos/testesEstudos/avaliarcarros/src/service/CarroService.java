package avaliarcarros.src.service;
import avaliarcarros.src.model.Carro;

public class CarroService {

    Carro carro = new Carro(null);

    public void adicionarPontoPositivo(String ponto){
        carro.setPontosPositivos(ponto);
    }

    public void adicionarPontoNegativo(String ponto){
        carro.setPontosNegativos(ponto);
    }

    public String mostrarPontos(){

    return carro.toString();

    }

}