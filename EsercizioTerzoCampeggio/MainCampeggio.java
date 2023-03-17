package EsercizioTerzoCampeggio;

import java.util.ArrayList;

public class MainCampeggio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Giovanni", "Marotta", "G.M.@", Genere.Maschio, 33);
        Staff staff = new Staff(1, "Pippo", "Franco", "pippofranco@gmail.com");
        System.out.println(cliente);
        System.out.println(staff);
        ArrayList<Cliente> clienti = new ArrayList<>();
        clienti.add(cliente);

        ArrayList<Persona> raccoltaFirme = new ArrayList<>();
        raccoltaFirme.add(cliente);
        raccoltaFirme.add(staff);
        //raccoltaFirme.add(new Attività("asd", Genere.Femmina, 23, staff, clienti));
        System.out.println(raccoltaFirme);
    }
    
}
