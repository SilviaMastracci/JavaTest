package EsercizioTerzoCampeggio;

public class Cliente {
     // definisco gli attributi come privati così non sono accessibili da altri file
     private String nome, cognome, mail, genere;
     private int età;
 
     // definisco i metodi
     // Costruttore
     public Cliente(){
 
     }
 
     public Cliente(String nome, String cognome, String mail, String genere, int età) {
         this.nome = nome;
         this.cognome = cognome;
         this.mail = mail;
         this.genere = genere;
         this.età = età;
     }
 
     public String getNome() {
         return nome;
     }
 
     public void setNome(String nome) {
         this.nome = nome;
     }
 
     public String getCognome() {
         return cognome;
     }
 
     public void setCognome(String cognome) {
         this.cognome = cognome;
     }
 
     public String getMail() {
         return mail;
     }
 
     public void setMail(String mail) {
         this.mail = mail;
     }
 
     public String getGenere() {
         return genere;
     }
 
     public void setGenere(String genere) {
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
         return "Attività [nome=" + nome + ", cognome=" + cognome + ", mail=" + mail + ", genere=" + genere + ", età="
                 + età + "]";
     }
}
