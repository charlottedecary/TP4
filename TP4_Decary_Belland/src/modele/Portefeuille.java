/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package modele;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
//mport java.util.Fonds;
//import java.util.Instrument;
/**
 *
 * @author eugeniebelland
 */


public class Portefeuille {
    
    //attributs
   static Map<String, Fonds> hash_fonds = new HashMap<String, Fonds>();
   static Map<String, Instrument> hash_instrument = new HashMap<String, Instrument>();
   
   //constructeurs
 public Portefeuille () {}
 public Portefeuille (Map<String, Fonds> fonds,Map<String, Instrument> instrument) {
 this.hash_instrument=instrument;
 this.hash_fonds=fonds;}
 
 //methode
 public void rechercherFonds(String clef){
     
     
 }
 public void ajouterMapFonds(String clef, double am){    
     Fonds f1 = new Fonds(clef, am);
        
    try { hash_fonds.put(clef, f1);
        } catch (FondInexistant e){
            System.out.println("fond inexisant !");
 }
 }
 //ON EST PAS SUR
 public void ajouterInstrument (String clef, Fonds fonds){
    Instrument i1 = new Instrument (clef, fonds);
    try { hash_instrument.put(clef, i1);
        } catch (InstrumentInexistant e){
            System.out.println("Instrument inexisant !");
        }
    
    }
 public void supprimerFonds(String clef){
   
 }
 public void supprimerInstrument(String clef){
     
 }
    
}
