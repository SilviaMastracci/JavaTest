package EsercizioTerzoCampeggio;

import java.util.ArrayList;

public class Attività {
   // definisco gli attributi come privati così non sono accessibili da altri file
   private String nome, limiteGenere;
   private int limiteEtà;
   private Staff staff; 
   private ArrayList<Cliente> persone = new ArrayList<>();

   // definisco i metodi
   // Costruttore
   public Attività(){
   }

   public Attività(String nome, String limiteGenere, int limiteEtà, Staff staff, ArrayList<Cliente> persone){
    this.nome = nome;
    this.limiteGenere = limiteGenere;
    this.limiteEtà = limiteEtà;
    this.staff = staff;
    this.persone = persone;
   }

   // Getter
   public String getNome(){
    return this.nome;
   }

   public String getLimiteGenere(){
    return this.limiteGenere;
   }

   public int getLimiteEtà(){
    return this.limiteEtà;
   }

   public Staff getStaff(){
    return this.staff;
   }

   public ArrayList<Cliente> getPersone(){
    return this.persone;
   }

   // Setter
   public void setNome(String nome){
    this.nome = nome;
   }

   public void setLimiteGenere(String limiteGenere){
    this.limiteGenere = limiteGenere;
   }

   public void setLimiteEtà(int limiteEtà){
    this.limiteEtà = limiteEtà;
   }

   public void setStaff(Staff staff){
    this.staff = staff;
   }

   public void setPersone(ArrayList<Cliente> persone){
    this.persone = persone;
   }

   // toString
   public String toString(){
    return "Nome: " + this.nome + " Limite genere: " + this.limiteGenere + " Limite età: " + this.limiteEtà + " Staff: " + this.staff + " Persone: " + this.persone;
   }

   // aggiungiPersona: permette di aggiungere persone alle attività
    public void aggiungiPersona(Cliente cliente){
        // la scrittura di sotto equivale a scrivere (this.personaAggiungibile(cliente) == true)
        if(this.personaAggiungibile(cliente)){
            this.persone.add(cliente);
            System.out.println("Hai aggiunto una persona");
        }
        else{
            System.out.println("Non può essere aggiunta");
        }
        
    }
    

    // personaAggiungibile: verifica che una persona possiede i requisiti di età richiesti
    private Boolean personaAggiungibile(Cliente cliente){
        // l'uguaglianza tra stringhe si rappresenta con stringa1.equals(stringa2), && vuol dire and, mentre || sta per or
        if(cliente.getEtà() < limiteEtà && cliente.getGenere().equals(limiteGenere)){
            return true;
        }
        return false;
    }
}
