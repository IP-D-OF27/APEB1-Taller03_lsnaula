package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        //Resolucion al problema//
         int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        int var7 = 100;
        int var8 = 25;
        int var9 = 100;
        boolean resultado1 = ((Math.sqrt(var1) + var2) / var3 == var4);
        boolean resultado2 = (var5>var6);
        boolean resultado3 = (var7/var8)>= Math.sqrt(var9);
        boolean resultadoFinal = resultado1 || resultado2 && resultado3;
        System.out.println("El resultado es: " + resultadoFinal );
        
    }
    
}
