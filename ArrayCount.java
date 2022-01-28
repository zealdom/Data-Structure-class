/*
escriba un programa que contenga una funcion de nombre cuantos que reciba como argumentos
un arreglo de vvalores enteros y un segundo argumento indicando el valor que se desea buscar en el 
arreglo. La funcion devolvera como resultado cuantas veces se encuentra el valor en el arreglo.
*/

public class ArrayCount {
   static int[] array = {1,1,1,1,2,2,2,2,3,3,3,3,3,1,0,1,0,1,0,1,0,10,10,10,10,4,5,5,5,4,4,49,9,8,8,8,8,8};
   static int count = 0;
   
   static int cuantos(int[] a, int n) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] == n) {
            count++;
         }
      }
      return(count);
   }
   
   public static void main (String [] args) {
      System.out.println(100 + cuantos(array, 8));
      
   }
}
