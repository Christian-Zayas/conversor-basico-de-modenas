package org.example;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    public static void main(String[] args) {
        //TODO This son element whats lest go utils plus
        final double USD = 1.08;
        final double EUR = 0.93;
        final double JPY = 139.40;
        final double GBP = 0.80;
        final double CHF = 0.90;
        final double CAD = 1.34;
        final double AUD = 1.48;

        JFrame ventana = new JFrame("Ventana con Select"); // Crear una instancia de JFrame con un título
        ventana.setSize(300, 200); // Establecer el tamaño de la ventana en píxeles
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hacer que la ventana se cierre al hacer clic en la "X"

        // Crear un array de opciones para el select
        String[] opciones = {
                "Dólar estadounidense (USD)",
                "Euro (EUR)",
                "Yen japonés (JPY)",
                "Libra esterlina (GBP)",
                "Franco suizo (CHF)",
                "Dólar canadiense (CAD)",
                "Dólar australiano (AUD)"
        };

        // Crear un elemento de selección (select)
        JComboBox<String> select = new JComboBox<>(opciones);
        select.setBounds(20, 10, 280, 30); // Establecer la posición y el tamaño del select dentro de la ventana
        // Agregar el select a la ventana
        ventana.add(select);
        JTextField textField = new JFormattedTextField();
        textField.setBounds(20, 80, 150,30);
        JButton btn = new JButton("Convertir moneda");
        btn.setBounds(20, 130, 150,30);
        btn.addActionListener(r -> {
            String valorTexto = (String) textField.getText();
            int  count = Integer.parseInt(valorTexto);
            String valorSeleccionado = (String) select.getSelectedItem();
            // System.out.print(valorSeleccionado);
            System.out.println("Valor seleccionado: " +  select.getSelectedItem());
            switch (valorSeleccionado){
                case "Dólar estadounidense (USD)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * USD));
                    break;
                case "Euro (EUR)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * EUR));
                    break;
                case "Yen japonés (JPY)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * JPY));
                    break;
                case "Libra esterlina (GBP)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * GBP));
                    break;
                case "Franco suizo (CHF)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * CHF));
                    break;
                case "Dólar canadiense (CAD)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * CAD));
                    break;
                case "Dólar australiano (AUD)" :
                    JOptionPane.showMessageDialog(null, "Muy bien " + valorSeleccionado + " " +  ( count * AUD));
                    break;
                default:
                    System.out.println("La modena que deseas convertir no esta disponible");
                    System.exit(0);
            }
        });
        // Agregar un evento de escucha de acción al select
        ventana.add(textField);
        ventana.add(btn);
        ventana.setLayout(null); // Desactivar el diseño por defecto de la ventana
        ventana.setVisible(true); // Hacer que la ventana sea visible
        Scanner countChange = new Scanner(System.in);
        //System.out.print("Por favor escribe el tipo de modena en iniciales Por ejemplo USD :");
        String nameChange = countChange.next();
        //System.out.print(nameChange); // Hare verify if is dollar or type money
        countChange.nextLine();
        //System.out.print(" Por favor ingrese la cantidad que desea hacer el cambio de moneda :");
        double countONE = countChange.nextDouble();
         countChange.nextLine();
        //System.out.print(countONE);
      countChange.close();
    }
}