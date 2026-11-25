package br.com.fatec;

import java.util.ArrayList;
import java.util.Collections;

public class TesteCarro {
    public static void main(String[] args) {
       ArrayList<Carro> carros = new ArrayList<>();


        Carro carro1 = new Carro("Grotti Cheetah", 500);
        Carro carro2 = new Carro("Bravado Banshee", 400);
        Carro carro3 = new Carro("Dinka Blista", 200);
        Carro carro4 = new Carro("Grotti Cheetah", 500);
        Carro carro5 = new Carro("Pegassi Infernus", 500);
        Carro carro6 = new Carro("Ocelot Pariah", 500);

        System.out.println(carro1.toString() + " faz a volta em " + carro1.getTempoDeVolta()+ "s");
        System.out.println(carro2.toString() + " faz a volta em " + carro2.getTempoDeVolta()+ "s");
        System.out.println(carro3.toString() + " faz a volta em " + carro3.getTempoDeVolta()+ "s");
        System.out.println("Iguais? " + carro1.equals(carro4));
        System.out.println("Iguais? " + carro1.equals(carro5));

        carros.add(carro3);
        carros.add(carro6);
        carros.add(carro2);
        carros.add(carro1);
        Collections.sort(carros);
      
        System.out.println(carros);
       
        
    }
}
