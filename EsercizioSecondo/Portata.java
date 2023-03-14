package EsercizioSecondo;

public class Portata {
    // Definisco gli attributi e li rendo privati così non sono accessibili da tutti i file
    private String nome, allergeni;
    private int prezzo;

    // DEfinisco i metodi
    // Costruttore
    public Portata(){
    }

    public Portata(String nome, String allergeni, int prezzo){
        this.nome = nome;
        this.allergeni = allergeni;
        this.prezzo = prezzo;
    }

    // Getter
    public String getNome(){
        return nome;
    }

    public String getAllergeni(){
        return allergeni;
    }

    public int getPrezzo(){
        return prezzo;
    }

    // Setter
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAllergeni(String allergeni){
        this.allergeni = allergeni;
    }

    public void setPrezzo(int prezzo){
        this.prezzo = prezzo;
    }

    // toString
    public String toString(){
        return "Nome: " + nome + "Allergeni: " + allergeni + "Prezzo: " + prezzo;
    }
}
