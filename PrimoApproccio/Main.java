package PrimoApproccio;
import java.sql.*;

public class Main {
    
    public static void main(String[] args) {
        //correva l'anno 2000
        Persona Piero = new Persona("Piero", "Marraffa", 53, 1);
        Persona Silvia = new Persona("Silvia", "Mastracci", 41, 0);


        //correva l'anno 2010
        Piero.setAltezza(120);
        System.out.println(Piero.getAltezza());
        

        //correva l'anno 2020
        Piero.setAltezza(180);
        System.out.println(Piero.getNome() + " " + Piero.getCognome() + " è cresciuto! Ora è alto " + Piero.getAltezza());

        Silvia.setAltezza(160);
        System.out.println(Silvia.getNome() + " " + Silvia.getCognome() + " è cresciuta! Ora è alta " + Silvia.getAltezza());
        System.out.println(Silvia);
    }
}
