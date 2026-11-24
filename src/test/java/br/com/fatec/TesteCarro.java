package br.com.fatec;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Grotti Cheetah", 500);
        Carro carro2 = new Carro("Bravado Banshee", 400);
        Carro carro3 = new Carro("Dinka Blista", 200);

        System.out.println(carro1.toString() + " faz a volta em " + carro1.getTempoDeVolta()+ "s");
        System.out.println(carro2.toString() + " faz a volta em " + carro2.getTempoDeVolta()+ "s");
        System.out.println(carro3.toString() + " faz a volta em " + carro3.getTempoDeVolta()+ "s");
    }
}
