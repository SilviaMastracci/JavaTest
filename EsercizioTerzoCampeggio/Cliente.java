package EsercizioTerzoCampeggio;

public class Cliente extends Persona{
     // definisco gli attributi come privati così non sono accessibili da altri file
     private Genere genere;
     private int età;
 
     // definisco i metodi
     // Costruttore
     public Cliente(){
     }
 
     public Cliente(String nome, String cognome, String mail, Genere genere, int età) {
        super(nome, cognome, mail);
         this.genere = genere;
         this.età = età;
     }
 
     public Genere getGenere() {
         return genere;
     }
 
     public void setGenere(Genere genere) {
         this.genere = genere;
     }
 
     public int getEtà() {
         return età;
     }
 
     public void setEtà(int età) {
         this.età = età;
     }

    @Override
    public String toString() {
        return super.toString() + "genere=" + this.genere + ", età=" + this.età ;
    }
 
     
}
