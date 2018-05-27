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
import vue.*;
/**
 *
 * @author charlottedecary
 */
public class Investissement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FondInexistant {
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
    try{
            p1.ajouterMapFonds(clef, amount);
            
        }catch( FondExistant | FondInexistant e){
            
            System.out.println("INFO: "+e.getMessage());
        }
    
    //test 1.6
    System.out.println("rentrer la clé d'un instrument : ");
    Scanner sca = new Scanner(System.in);
    String cle = sca.next();
    /*ArrayList<Fonds> a = new ArrayList<Fonds>();
    Instrument i1 = new Instrument (cle, a);
    ArrayList<Fonds> al = p1.rechercherInstrument(i1.getCle());
    */
    try{
            ArrayList<Fonds> a = new ArrayList<Fonds>();
            Instrument i1 = new Instrument (cle, a);
            ArrayList<Fonds> al = p1.rechercherInstrument(i1.getCle());
    
  
        }catch(InstrumentInexistant e){
            System.out.println("INFO: "+e.getMessage());
            System.out.println("On instancie un nouvel instrument");
     
        }
        p1.ajouterFondInstrument(cle,new Fonds());
    
    
    
    //test1.7
    System.out.println("rentrer un cle pour supprimer son fond");
    String clesup = sc.next();
    
    try{
         p1.rechercherFonds(clesup);
         p1.supprimerFonds(clesup);
     }catch(FondInexistant e){
         System.out.println("INFO: "+e.getMessage());
     }
    
    //test1.8
    System.out.println("rentrer un cle pour supprimer son instrument");
    String clesupr = sc.next();
    
    try{
           p1.rechercherInstrument(clesupr);
           p1.supprimerInstrument(clesupr);
            
        }catch(InstrumentInexistant e){

            System.out.println("INFO: "+e.getMessage());
        }
    }
    
    
}
