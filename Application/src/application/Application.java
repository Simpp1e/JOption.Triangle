package application;

import javax.swing.JOptionPane;

import entidades.Triangle;


public class Application {

    public static void main(String[] args) {
        
        String aux = "";
        Triangle x;
        
        x = new Triangle();
        
        aux = JOptionPane.showInputDialog(null, "Digite o valor 1: ");
        x.a = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o valor 2: ");
        x.b = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Digite o valor 3: ");
        x.c = Double.parseDouble(aux);

        Double area = x.area();
        JOptionPane.showMessageDialog(null, "Área: " + area);
    }
          
}
