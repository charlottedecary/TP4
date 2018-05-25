/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_decary_belland.vue;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections ;

/**
 *
 * @author eugeniebelland
 */
public class Instrument {
    //attributs
    ArrayList<Fonds> al = new ArrayList<Fonds>();
    private String cle;
    
    //constructeurs 
    public Instrument(ArrayList<Fonds> al, String cle) {
 this.al=al;
 this.cle=cle;
   }
   //methodes
    
    public void addFonds (Fonds obj){
        al.add(obj);
    }
    
    
    
}


