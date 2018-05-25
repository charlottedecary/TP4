/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

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

    public Instrument(String cle, ArrayList<Fonds> a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addFonds (Fonds obj){
        al.add(obj);
    }
    
    public ArrayList<Fonds> getfonds( ) {
    return al;}
    
    


    public String getCle( ) {
    return cle;}
    
    
}

