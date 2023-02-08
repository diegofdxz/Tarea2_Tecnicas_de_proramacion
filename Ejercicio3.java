import javax.swing.JOptionPane;

/*
 * Ejercicio 3
 * Que hace este algoritmo? 
 * El algoritmo intercambia el valor de dos variables
 * 
 */



 class Ejercicio3 {
     public static void main(String[] args) {
    double valor1, valor2;
    valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un valor"));
    valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro valor"));
    double aux = valor1;
    valor1 = valor2;
    valor2 = aux;
    System.out.println("Valor 1 = " + valor1 + " y Valor 2 = " + valor2);
     }
 }