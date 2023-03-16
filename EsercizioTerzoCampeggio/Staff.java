package EsercizioTerzoCampeggio;

public class Staff extends Persona{
    private int id;

    // costruttore
    public Staff(){

    }
    
    public Staff(int id, String nome, String cognome, String mail){
        super(nome, cognome, mail);
        this.id = id;
    }

    // getter
    public int getId(){
        return this.id;
    }

    // setter
    public void setId(int id){
        this.id = id;
    }

    // toString
    public String toString(){
        return super.toString() + "ID: " + this.id;
    }
}
