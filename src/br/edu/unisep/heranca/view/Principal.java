package br.edu.unisep.heranca.view;
import br.edu.unisep.heranca.model.Frota;
import br.edu.unisep.heranca.model.Carro;
import br.edu.unisep.heranca.model.Moto;
import br.edu.unisep.heranca.model.Caminhao;

public class Principal {
    public static void main(String[] args) {

        Frota frota = new Frota();


        frota.adicionarVeiculo(new Carro("Honda", "Civic", 2024, 4));
        frota.adicionarVeiculo(new Moto("Yamaha", "R1", 2024, 1000));
        frota.adicionarVeiculo(new Caminhao("Mercedes", "Arocs",2024,"soja"));


        frota.exibirFrota();
    }
}