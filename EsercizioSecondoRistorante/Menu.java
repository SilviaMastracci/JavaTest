package EsercizioSecondoRistorante;

import java.util.ArrayList;

public class Menu {
    // Definisco gli attributi e li rendo privati così che non sono accessibili da tutti i file
    private String nome;
    private ArrayList<Portata> portate = new ArrayList<>();
    
    // Definisco i metodi
    // Costruttore
    public Menu(){
    } 

    public Menu(String nome, ArrayList<Portata> portate){
        this.nome = nome;
        this.portate = portate;
    }

    // Getter
    public String getNome(){
        return nome;
    }

    public ArrayList<Portata> getPortate(){
        return portate;
    }

    // Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPortate(ArrayList<Portata> portate){
        this.portate = portate;
    }

    // toString
    public String toString(){
        return "Nome: " + nome + "Portate: " + portate;
    }

    // aggiungiPortata
    public void aggiungiPortata(Portata portata){
        portate.add(portata);
    }

    // togliPortata
    public void togliPortata(Portata portata){
        portate.remove(portata);
    }
}
