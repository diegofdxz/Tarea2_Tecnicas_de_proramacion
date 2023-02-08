/*
 * Ejercicio 2
 * 
 * Que veremos tras ejecutar el siguiente algoritmo?
 * En el primer caso se imprimira "Test, valor 2 = 4"
 * En el segundo caso se imprimira "4 # 49.78"
 */
class Ejercicio2 {
    public static void main(String[] args) {
        int valor1, valor2;
        String cadena1;
        final double CST = 49.78;
        valor1 = 92 % 8;
        valor2 = 2 * valor1;
        cadena1 = "Test";
        System.out.println(cadena1 + ", valor 2 = " + valor2);
        System.out.println(valor1 + " # " + CST);
    }
}