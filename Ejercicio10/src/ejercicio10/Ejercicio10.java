package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        // Resolucion del problema//
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 10;
        int var5 = 5;
        int var6 = 2;
        boolean resultado1 = Math.sqrt(var1) * var2 >= var3;
        boolean resultado2 = true;
        boolean resultado3 = false;
        boolean resultado4 = var4/var5 >= var6;
        boolean resultadoFinal = resultado1 && resultado2 || resultado3 || resultado4;
        System.out.println("El resultado final es: " + resultadoFinal);
    }
    
}
