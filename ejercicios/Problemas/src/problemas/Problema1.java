/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
         presentarValores(informacion);
    }
    
    public static void presentarValores(int [][] datos){
        String cadena = "";
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if(i<=j){
                    cadena = String.format("%s%s\t", cadena, datos[i][j]);
                }
            }
        }
        System.out.println(cadena);;
    
    }
    
}
