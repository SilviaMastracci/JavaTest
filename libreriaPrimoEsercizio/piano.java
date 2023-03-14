package libreriaPrimoEsercizio;

import java.util.ArrayList;

public class Piano {
    // Ho reso privati gli attributi così non sono accessibili da tutti i file
    private int numero; 
    private ArrayList<Scaffale> scaffali = new ArrayList<>();
    // Defenisco i metodi
    // Costruttore
    public Piano(){
    }

    // Metodi get
    public int getNumero(){
        return this.numero;
    }

    public ArrayList<Scaffale> getScaffali(){
        return this.scaffali;
    }

    // Metodi set
    public void setNumero(int numero){
        this.numero=numero;
    }

    public void setScaffali(ArrayList<Scaffale> scaffali){
        this.scaffali=scaffali;
    }

    // Metodo toString
    public String toString(){
        return this.numero + " " + this.scaffali;
    }
}
