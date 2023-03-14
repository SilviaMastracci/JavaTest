package libreriaPrimoEsercizio;

import java.util.ArrayList;

public class Scaffale {
    // Rendo privati gli attributi così non sono accessibili da tutti i file
    private int id; 
    private ArrayList<libro> libri = new ArrayList<>();
    // Definisco i metodi 
    // Costruttore
    public Scaffale(){
    }

    // Metodi get
    public int getId(){
        return this.id;
    }

    public ArrayList<libro> getLibri(){
        return this.libri;
    }

    // Metodi set
    public void setId(int id){
        this.id=id;
    }

    public void setLibri(ArrayList<libro> libri){
        this.libri=libri;
    }

    // Metodo toString
    public String toString(){
        return this.id + " " + this.libri;
    }

    // Metodo aggiungiLibro
    public void aggiungiLibro(libro libro){
        libri.add(libro);
    }
}

