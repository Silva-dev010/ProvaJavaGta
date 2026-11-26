package br.com.fatec;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Builder 
@Getter 
public class Partida {
    private int codigo;
    private String jogador;
    private int pontuacao;

}
