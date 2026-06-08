package tarea1.progra2;

import javax.swing.JOptionPane;

public class Tarea1Progra2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido, por favor, inserte los datos que se le solicitan a continuación");
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido: ");
        String edad = JOptionPane.showInputDialog(null, "Ingrese su edad: "); 
        String email = JOptionPane.showInputDialog(null, "Ingrese su email: ");
        String telefono = JOptionPane.showInputDialog(null, "Ingrese su número de teléfono: ");
        
        JOptionPane.showMessageDialog(null, "         DATOS      \n\n" +
                                            "Nombre: " + nombre + "\n" +
                                            "Apellido: " + apellido + "\n" +
                                            "Edad: " + edad + "\n" +
                                            "Email: " + email + "\n" +
                                            "Número de teléfono: " + telefono);
    }
    
}
