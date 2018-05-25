/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_decary_belland.vue;

/**
 *
 * @author eugeniebelland
 */
public class Fonds {
     //attributs 
    private double amount;   
    private String clef;
    
    
    public Fonds () {
    
    }
    public Fonds (String clef, double amount) {
    this.clef = clef;
    this.amount=amount;
    }
}
