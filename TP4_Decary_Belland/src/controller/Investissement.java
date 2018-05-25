/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modele.Fonds;
import java.util.*;
import java.util.Scanner;
import modele.Instrument;
import modele.Fonds;
import modele.Portefeuille;

/**
 *
 * @author charlottedecary
 */
public class Investissement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test 1.5
    System.out.println("rentrer la clé et le montant du fond : ");
    Scanner sc = new Scanner(System.in);
    String clef = sc.next();  
    double amount = sc.nextDouble();
    Fonds f1=new Fonds(clef, amount);
    //System.out.println(f1.getAmount() + f1.getClef());
    Portefeuille p1 = new Portefeuille ();
    double am= p1.rechercherFonds(f1.getClef());
    //if exectpion
   // {
        //Map<String, Fonds> map1 =new HashMap <String, Fonds>("map1",f1);
        
    //}
    
    
    //test 1.6
    System.out.println("rentrer la clé d'un instrument : ");
    Scanner sca = new Scanner(System.in);
    String cle = sca.next();
    ArrayList<Fonds> a = new ArrayList<Fonds>();
    Instrument i1 = new Instrument (cle, a);
    ArrayList<Fonds> al = p1.rechercherInstrument(i1.getCle());
    
    //test1.7
    p1.rechercherFonds(clef);
    //if machin
   //message erreur
    
    //else
     p1.supprimerFonds(clef);
    
     
    //test1.8
    p1.rechercherInstrument(clef);
    //si machin
    
    
    //else
    p1.supprimerInstrument(clef);
    }
    
    
}
