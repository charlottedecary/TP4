/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package modele;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import modele.Fonds;
import modele.Instrument;
import vue.FondExistant;
import vue.FondInexistant;
import vue.InstrumentInexistant;

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
 
 //methodes
 public double rechercherFonds(String clef){
     
     for(int i=0;i<hash_fonds.size();i++)
     {
         if(hash_fonds.containsKey(clef)==true)
         {
             return hash_fonds.get(clef).getAmount();
         }
         else if(hash_fonds.containsKey(clef)==false) 
         {
             throw new FondInexistant();
             
         }
     }
 }
 public ArrayList<Fonds> rechercherInstrument(String clef){
     
     for(int i=0;i<hash_instrument.size();i++)
     {
         if(hash_instrument.containsKey(clef)==true)
         {
             return hash_instrument.get(clef).getfonds();
         }
         else if(hash_instrument.containsKey(clef)==false) 
         {
             throw new InstrumentInexistant();
         }
     }
 }
 
 public void ajouterMapFonds(String clef, double am){    
      
     for(int i=0;i<hash_fonds.size();i++)
     {
         if(hash_fonds.containsKey(clef)==true)
         {
             throw new FondExistant();
         }
         else if(hash_fonds.containsKey(clef)==false) 
         {
             Fonds f1 = new Fonds(clef, am);
         }
     }   
 }

 public void ajouterFondInstrument (String clef, Fonds fonds){

    Instrument i1 = new Instrument (clef,fonds);
    i1.addFonds(fonds);
    }
 
 
 
 public void supprimerFonds(String clef){
     hash_fonds.remove(clef);
   
 }
 public void supprimerInstrument(String clef){
     hash_instrument.clear();
 }
    
}
