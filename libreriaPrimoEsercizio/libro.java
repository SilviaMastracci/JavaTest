package libreriaPrimoEsercizio;

public class libro {
    // Ho reso privati gli attributi perchè sennò sono visibili da tutti i file 
    private String nome, scrittore, genere, editore;

    // Definisco i metodi
    // Costruttore
    public libro(){
    }

    public libro(String nome, String scrittore, String genere, String editore){
        this.nome = nome;
        this.scrittore = scrittore;
        this.genere = genere;
        this.editore = editore;
    }

    // Metodi get
    public String getNome(){
        return this.nome;
    }

    public String getScrittore(){
        return this.scrittore;
    }

    public String getGenere(){
        return this.genere;
    }

    public String getEditore(){
        return this.editore;
    }

    // Metodi set
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setScrittore(String scrittore){
        this.scrittore=scrittore;
    }

    public void setGenere(String genere){
        this.genere=genere;
    }

    public void setEditore(String editore){
        this.editore=editore;
    }

    // Metodi toString
    public String toString(){
        return this.nome +" "+ this.scrittore +" "+ this.genere +" "+ this.editore;
    }
}
