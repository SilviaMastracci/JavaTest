package Capitolo1_libro;

import javax.swing.*;

public class Progetto1_1 {
    public static void main(String[] args){
        JOptionPane.showInputDialog("What would you like me to do?");
        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");
    }
}
