/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tp4_decary_belland.vue;

import java.util.HashMap;
import java.util.Map;
//mport java.util.Fonds;
//import java.util.Instrument;
/**
 *
 * @author eugeniebelland
 */


public class Portefeuille {
    
   static Map<String, Fonds> hash_fonds = new HashMap<String, Fonds>();
   static Map<String, Instrument> hash_instrument = new HashMap<String, Instrument>();
   
 public Portefeuille () {}
 public Portefeuille (Map<String, Fonds> fonds,Map<String, Instrument> instrument) {
 this.hash_instrument=instrument;
 this.hash_fonds=fonds;}
    
}
