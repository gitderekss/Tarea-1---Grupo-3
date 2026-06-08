package tarea1.progra2;

import javax.swing.JOptionPane;

public class Tarea1Progra2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido, por favor, inserte los datos que se le solicitan a continuación");
        
        String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
        String apellido = JOptionPane.showInputDialog(null, "Apellido: ");
        String edad = JOptionPane.showInputDialog(null, "Edad: "); 
        String email = JOptionPane.showInputDialog(null, "Email: ");
        String telefono = JOptionPane.showInputDialog(null, "Número de teléfono: ");
    }
    
}
