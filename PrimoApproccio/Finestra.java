package PrimoApproccio;

public class Finestra {

    //definisco gli attributi
    private String nome, produttore;
    private int numeroAnte;
    private float altezza, larghezza;


    //costruttore
    public Finestra(){
    }

    public Finestra(String nome, String produttore, int numeroAnte){
        this.nome = nome;
        this.produttore = produttore;
        this.numeroAnte = numeroAnte;
    }

    //getter and setter
    public String getNome(){
        return nome;
    }

    public String getProduttore(){
        return produttore;
    }

    public int getNumeroAnte(){
        return numeroAnte;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProduttore(String produttore){
        this.produttore = produttore;
    }

    public void setNumeroAnte(int nunmeroAnte){
        this.numeroAnte = numeroAnte;
    }

    //metodi
    public String toString(){
        return "Nome: " + nome + " Produttore: " + produttore + " numero di ante: " + numeroAnte;
    }


}
