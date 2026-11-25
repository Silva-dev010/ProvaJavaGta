package br.com.fatec;

import java.util.Random;

public class TestePiloto {
    public static void main(String[] args) {
        Random gerador = new Random();
        Piloto piloto = new Piloto("Lucia ", new Carro("Grotti Cheetah", 500));
        Piloto piloto1 = new Piloto("Lucia ", new Carro("Dinka Blista", 200));
        System.out.println(piloto.toString());
        piloto.somarPontos(10);
        piloto.registrarVitoria();
        piloto.correr(gerador, false);
        System.out.println("Tempo sem nitro: " + piloto.getTempo()+ "s");
        piloto.correr(gerador, true);
        System.out.println("Tempo com nitro: " + piloto.getTempo()+ "s");
        System.out.println(piloto.toString());
        System.out.println("Iguais? " + piloto.equals(piloto1));



    }

}
