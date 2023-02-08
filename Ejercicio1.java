/*
 * Ejercicio 1
 * Después de ejecutar el programa, ¿qué valores tendrán las variables a y b?
 * En el primer caso "a" tendra el valor de 3
 * En el segundo caso "a" tendra el valor de 3 y "b" tendra el valor de 8
 * En el tercer caso "a" tendra el valor de 7 y "b" tendra el valor de 8 
 */

 
class Ejercicio1 {
    public static void main(String[] args) {
        int a,b;
        a = 3;
        System.out.println("A = " + a);
        b = a + 5;
        System.out.println("A = " + a + " y B = " + b);
        a = 7;
        System.out.println("A = " + a + " y B = " + b);
    }
}