/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Daniel
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución del ejercicio
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 200;
        int var8 = 50;
        int var9 = 51;
        
        System.out.println("--------------Solución--------------------");
        boolean resultado = ((var1 * var2) + var3 - (var4 / var5) + 
                Math.pow(var6,2) >= var7) || (var8 >= var8 - var8 + var9);
        System.out.println(resultado);
    }
    
}
