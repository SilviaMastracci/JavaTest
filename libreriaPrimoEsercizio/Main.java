package libreriaPrimoEsercizio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //CREA UN OGGETTO DI LIBRO, METTILO IN UNO SCAFFALE, METTI LO SCAFFALE SU UN PIANO E STAMPA IL PIANO
        /*
         * variabile = valore
         * String variabile = valore
         * creo un oggetto libro: 
         * Libro libro1 = valore
         */
        Libro libro1 = new Libro();
        libro1.setNome("La bella e la bestia");
        libro1.setEditore("Mondadori");
        libro1.setScrittore("Giovanni");
        libro1.setGenere("Fantasy");

        Libro libro2 = new Libro();
        libro2.setNome("Il piccolo principe");
        libro2.setEditore("Mondadori");
        libro2.setScrittore("Pernacchia");
        libro2.setGenere("Fantasy");

        // ArrayList<Libro> listaDiLibri = new ArrayList<>();
        // listaDiLibri.add(libro1);
        // listaDiLibri.add(libro2);

        Scaffale scaffale1 = new Scaffale();
        scaffale1.setId(3456);
        // scaffale1.setLibri(listaDiLibri);
        // scaffale1.getLibri().add(libro1);
        scaffale1.aggiungiLibro(libro1);
        scaffale1.aggiungiLibro(libro2);
    
        Piano piano1 = new Piano();
        piano1.setNumero(1);
        piano1.getScaffali().add(scaffale1);

        System.out.println(piano1);

    }
}
