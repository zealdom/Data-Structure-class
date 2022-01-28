/*
Escriba un programa que le pida al usuarrio las dimensiones para una matriz m x n
y luego le pida que entre los valores. Luego el programa imprimira la matriz en forma de tabla.
*/

import java.util.Scanner;

class MultidimensionalArray {  
   public static void main (String [] args) {
      Scanner input = new Scanner(System.in);
      int [][] multiArray;
      int row, column;
      
      System.out.print("Cuantas filas? ");
      row = input.nextInt();
      System.out.print("Cuantas columnas? ");
      column = input.nextInt();
      
      multiArray = new int[row][column];
      
      for (int i = 0; i < row; i++) {
         for (int j = 0; j < column; j++) {
            System.out.print("Entre valor [" + i + "," + j + "]: ");
            multiArray[i][j] = input.nextInt();
         } 
      }
      
      for (int i = 0; i < row; i++) {
         System.out.print("\n|");
         for (int j = 0; j < column; j++) {
            System.out.print(" " + multiArray[i][j]);
         }
         System.out.print(" |");
      }    
   }
}
