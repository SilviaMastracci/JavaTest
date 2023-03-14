package EsercizioSecondo;

import java.util.ArrayList;

public class Tavolo {
    // Definisco gli attributi e li rendo privati così da non essere accessibili dagli altri file
    private int id, numeroPosti;
    private ArrayList<Portata> comanda = new ArrayList<>();
    
    // Definisco i metodi
    // Costruttore
    public Tavolo(){
    }

    public Tavolo(int id, int numeroPosti, ArrayList<Portata> comanda){
        this.id = id;
        this.numeroPosti = numeroPosti;
        this.comanda = comanda;
    }

    // Getter
    public int getId(){
        return this.id;
    }

    public int getNumeroPosti(){
        return this.numeroPosti;
    }

    public ArrayList<Portata> getComanda(){
        return this.comanda;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }

    public void setNumeroPosti(int numeroPosti){
        this.numeroPosti = numeroPosti;
    }

    public void setComande(ArrayList<Portata> comanda){
        this.comanda = comanda;
    }

    // toString
    public String toString(){
        return "Id: " + this.id + "Numero posti: " + this.numeroPosti + "Comanda: " + this.comanda;
    }

    // aggiungiPortata: permette di aggiungere una portata alla comanda
    public void aggiungiPortata(Portata portata){
        this.comanda.add(portata);
    }

    // togliPortata: 
    public void togliPortata(Portata portata){
        this.comanda.remove(portata);s
    }

    // getTotale: calcola il costo totale di un tavolo 
    public int getTotale(){
        int totale = 0;
        // for(int i = 0; i < this.comanda.size(); i++){
        //     totale = totale + this.comanda.get(i).getPrezzo();
        // }
        for (Portata portata : comanda) {
            totale = totale + portata.getPrezzo();
        }
        return totale;
    }

    // getTotaleIva: calcola il prezzo totale con iva inclusa
    public int getTotaleIva(){
        int totale = 0;
        for (Portata portata : comanda) {
            totale = totale + portata.getPrezzo();
        }
        int totaleIva = totale + (totale*22)/100;
        return totaleIva;
    }

    //con this.getTotale() vado a indicare che voglio usare il metodo getTotale sull'oggetto stesso che richiama il metodo totaleIva() dal Main
    public int totaleIva(){
        int totale = this.getTotale();
        int totaleIva = totale + (totale*22)/100;
        return totaleIva;
    }
}
