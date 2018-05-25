/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

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
    public double getAmount() {
    return amount;}
    
    public String getClef() {
    return clef;}
}
