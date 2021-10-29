/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author Daniel
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución
        
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        
        System.out.println("------------Solución-----------");
        boolean resultado = (((Math.sqrt(var1) + var2) / var3) == var4)
                && (var5 > var6);
        
        System.out.println(resultado);
    }
    
}
