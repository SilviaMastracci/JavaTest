package PrimoApproccio;

public class Persona {
    String nome, cognome;
    int altezza, eta;


    public Persona() {
    }

    public Persona(String nome, String cognome, int altezza, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.altezza = altezza;
        this.eta = eta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAltezza() {
        return this.altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getEta() {
        return this.eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String toString(){
        return this.nome + " " + this.cognome + " è cresciuta! Ora è alta " + this.altezza;
    }

}
