package br.com.fatec;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class Campeonato {
    List<Piloto> pilotos = new  ArrayList<>();
    int[] pontos = {10, 6, 3, 1};
 
    public void inscrever(Piloto piloto){
        if(pilotos.size() >= 4){
            System.out.println("Grid cheio.");
            return;
        }
        if(pilotos.contains(piloto)){
            System.out.println("Piloto repetido.");
            return;
        }
        pilotos.add(piloto);
    }
 
    public void registrarCorrida(List<Piloto> chegada){
        for(int i=0; i<chegada.size(); i++) {
            chegada.get(i).somarPontos(pontos[i]);
            if(i == 0){
                chegada.get(i).registrarVitoria();
            }
        }
    }
 
    public List<Piloto> disputarCorrida(Random gerador, Piloto jogador, boolean nitro) {
        List<Piloto> chegada = new ArrayList<>(pilotos);
        for (Piloto piloto : chegada) {
            piloto.correr(gerador, piloto.equals(jogador) && nitro);
        }
        chegada.sort((a, b) -> Integer.compare(a.getTempo(), b.getTempo()));
        registrarCorrida(chegada);
        return chegada;
    }
 
    public List<Piloto> getClassificacao() {
        List<Piloto> classificacao = new ArrayList<>(pilotos);
        classificacao.sort((a, b) -> {
            int compararPontos = Integer.compare(b.getPontos(), a.getPontos());
            if (compararPontos != 0) return compararPontos;
            int compararVitorias = Integer.compare(b.getVitorias(), a.getVitorias());
            if (compararVitorias != 0) return compararVitorias;
            return a.getNome().compareTo(b.getNome());
        });
        return classificacao;
    }
}