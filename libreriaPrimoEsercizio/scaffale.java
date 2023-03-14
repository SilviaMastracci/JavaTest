package libreriaPrimoEsercizio;

import java.util.ArrayList;

public class Scaffale {
    // Rendo privati gli attributi così non sono accessibili da tutti i file
    private int id; 
    private ArrayList<Libro> libri = new ArrayList<>();
    // Definisco i metodi 
    // Costruttore
    public Scaffale(){
    }

    // Metodi get
    public int getId(){
        return this.id;
    }

    public ArrayList<Libro> getLibri(){
        return this.libri;
    }

    // Metodi set
    public void setId(int id){
        this.id=id;
    }

    public void setLibri(ArrayList<Libro> libri){
        this.libri=libri;
    }

    // Metodo toString
    public String toString(){
        return this.id + " " + this.libri;
    }

    // Metodo aggiungiLibro
    public void aggiungiLibro(Libro libro){
        libri.add(libro);
    }
}

