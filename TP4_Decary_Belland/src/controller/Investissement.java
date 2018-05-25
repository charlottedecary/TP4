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
    
    
    //test 1.6
    System.out.println("rentrer la clé d'un instrument : ");
    Scanner sca = new Scanner(System.in);
    String cle = sca.next();
    
    Instrument i1 = new Instrument (cle, f1);
    }
    
    
}
