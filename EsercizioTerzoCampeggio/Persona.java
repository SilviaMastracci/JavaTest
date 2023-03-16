package EsercizioTerzoCampeggio;

public class Persona {
    private String nome, cognome, mail;

    public Persona(){

    }

    public Persona(String nome, String cognome, String mail) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
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

    @Override
    public String toString() {
        return "nome=" + this.nome + ", cognome=" + this.cognome + ", mail=" + this.mail + " ";
    }

    
}
