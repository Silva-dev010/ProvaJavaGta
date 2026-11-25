package br.com.fatec;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor 

public class Carro implements Comparable <Carro> {
    private String modelo;
    private int pontencia;

    public int getTempoDeVolta() {

        return 30 + 6000 / pontencia;

    }

   public String toString(){


    return modelo + " (" + pontencia + " cv)" ; 
   } 

   @Override 
   public boolean equals(Object obj){

    if (this == obj) {
        
        return true;
        
    }
    if (!(obj instanceof Carro)) {
        
        return false;
        
    }
    Carro carro = (Carro) obj;
    return this.modelo.equals(carro.modelo);
   }
   @Override 
   public int compareTo(Carro c){
    if (this.pontencia != c.pontencia) {
        return Integer.compare(c.pontencia, this.pontencia);
    }
    
    return this.modelo.compareTo(c.modelo); 

   }
}

  
