package br.com.fatec;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor 
public class Carro {
    private String modelo;
    private int pontencia;

    public int getTempoDeVolta() {

        return 30 + 6000 / pontencia;

    }

   public String toString(){


    return modelo + " (" + pontencia + " cv)" ; 
   } 

}
