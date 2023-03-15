package EsercizioPrimoLibreria;

import java.util.ArrayList;

public class piano {
    // Ho reso privati gli attributi così non sono accessibili da tutti i file
    private int numero; 
    private ArrayList<scaffale> scaffali = new ArrayList<>();
    // Defenisco i metodi
    // Costruttore
    public piano(){
    }

    // Metodi get
    public int getNumero(){
        return this.numero;
    }

    public ArrayList<scaffale> getScaffali(){
        return this.scaffali;
    }

    // Metodi set
    public void setNumero(int numero){
        this.numero=numero;
    }

    public void setScaffali(ArrayList<scaffale> scaffali){
        this.scaffali=scaffali;
    }

    // Metodo toString
    public String toString(){
        return this.numero + " " + this.scaffali;
    }
}
