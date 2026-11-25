package br.com.fatec;

import java.util.Random;

import lombok.Getter;

@Getter 
public class Piloto {
    private String nome;
    private Carro carro;
    private int pontos, vitorias, tempo;

    public Piloto(String nome, Carro carro) {

        this.nome = nome;
        this.carro = carro;
        pontos = 0;
        vitorias = 0;
    }

    public void correr(Random gerador, boolean nitro) {
        tempo = 0;
        for (int i = 0; i < 3; i++) {
            tempo += carro.getTempoDeVolta() + gerador.nextInt(5);

        }
        if (nitro) {
            tempo -= 10;

        }

    }

    public void somarPontos(int pontos) {
        this.pontos = pontos;

    }

    public void registrarVitoria() {
        this.vitorias += 1;
    }

    
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;

        }
        if (!(obj instanceof Piloto)) {

            return false;

        }
        Piloto piloto = (Piloto) obj;
        return this.nome.equals(piloto.nome);

    }

    public String toString(){
        return (nome + "- " + pontos +" pontos" + " - " + vitorias + " Vitoria(s)");
    }

}
