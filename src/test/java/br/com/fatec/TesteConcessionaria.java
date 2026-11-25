package br.com.fatec;

public class TesteConcessionaria {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        System.out.println("Carros no estoque: " + concessionaria.restantes());
        System.out.println("Sorteou: " + concessionaria.sortear());
        System.out.println("Sorteou: " + concessionaria.sortear());
        System.out.println("Sorteou: " + concessionaria.sortear());
        System.out.println("Carros no estoque: " + concessionaria.restantes());

    }

}
