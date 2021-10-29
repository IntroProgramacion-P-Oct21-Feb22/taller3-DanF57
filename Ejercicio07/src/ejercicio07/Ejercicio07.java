/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author Daniel
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución problema
        
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        int var7 = 100;
        int var8 = 25;
        int var9 = 100;
        
        System.out.println("--------------Solución--------------------");
        boolean resultado = (((Math.sqrt(var1) + var2) / var3) == var4)
                || (var5 > var6) && ((var7 / var8) > Math.sqrt(var9));
        
        System.out.println(resultado);
    }
    
}
