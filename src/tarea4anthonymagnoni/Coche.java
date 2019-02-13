/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4anthonymagnoni;

/**
 *
 * @author anthony
 */
public class Coche {
    
    private int puertas;
    private int rueda;
    private boolean sport;

    public Coche() {
    }

    public Coche(int puertas, int rueda, boolean sport) {
        this.puertas = puertas;
        this.rueda = rueda;
        this.sport = sport;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRueda() {
        return rueda;
    }

    public void setRueda(int rueda) {
        this.rueda = rueda;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }
    
    
    
}
