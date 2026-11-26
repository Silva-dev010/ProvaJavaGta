package br.com.fatec;
 
import java.util.Arrays;
import java.util.List;
 
public class TesteCampeonato {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Grotti Cheetah", 500);

        Piloto lucia = new Piloto("Lucia", carro);
        Piloto jason = new Piloto("Jason", carro);
        Piloto raul = new Piloto("Raul", carro);
        Piloto cal = new Piloto("Cal", carro);

        Campeonato campeonato = new Campeonato();

        campeonato.inscrever(lucia);
        campeonato.inscrever(jason);
        campeonato.inscrever(new Piloto("Lucia", carro));
        campeonato.inscrever(raul);
        campeonato.inscrever(cal);
        campeonato.inscrever(new Piloto("Boobie", carro));

        campeonato.registrarCorrida(Arrays.asList(lucia, jason, raul, cal));
        campeonato.registrarCorrida(Arrays.asList(raul, cal, jason, lucia));
        campeonato.registrarCorrida(Arrays.asList(cal, raul, jason, lucia));

        List<Piloto> classificacao = campeonato.getClassificacao();

        for (int i = 0; i < classificacao.size(); i++) {

            System.out.println((i + 1) + ". " + classificacao.get(i));

        }
    }
}