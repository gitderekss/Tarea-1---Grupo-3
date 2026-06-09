package tarea1.progra2;

import javax.swing.JOptionPane;

public class Tarea1Progra2 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido, por favor, inserte los datos que se le solicitan a continuación");
        
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido: ");
        String edad = JOptionPane.showInputDialog(null, "Ingrese su edad: "); 
        int edadNum = 0;
        try {
            edadNum = Integer.parseInt(edad);
            if (edadNum < 0) {
                JOptionPane.showMessageDialog(null, "La edad no puede ser negativa. Se asignara 0. ", "Error de Validacion", JOptionPane.WARNING_MESSAGE);
                edadNum = 0;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de edad inválido, solo números enteros. Se le asignara 0."+"Error " + e.getMessage() + JOptionPane.ERROR_MESSAGE);
            
        }
        String email = JOptionPane.showInputDialog(null, "Ingrese su email: ");
        String telefono = JOptionPane.showInputDialog(null, "Ingrese su número de telefono: ");
        try {
            
            Long.parseLong(telefono);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de teléfono inválido, No incluya letras, guiones ni espacios. 'No especificado'. "+ "Error " + e.getMessage()+JOptionPane.ERROR_MESSAGE);
            telefono = "No especificado";
        }
        JOptionPane.showMessageDialog(null, "         DATOS      \n\n" +
                                            "Nombre: " + nombre + "\n" +
                                            "Apellido: " + apellido + "\n" +
                                            "Edad: " + edadNum + "\n" +
                                            "Email: " + email + "\n" +
                                            "Número de teléfono: " + telefono);
    }
    
}
