import javax.swing.JOptionPane;

/*
 * Ejercicio 4
 * Escriba un algoritmo que calcule la velocidad media de desplazamiento de un usuario utilizando km/h
 */

 
 class Ejercicio4 {
     public static void main(String[] args) {
         double distancia, tiempo, velocidad;
         distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia recorrida en km"));
         tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tiempo en horas"));
         velocidad = distancia / tiempo;
         System.out.println("La velocidad media es de " + velocidad + " km/h");
     }
 }
 
