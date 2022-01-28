/*
Escriba un pprograma que contenga una funcion -------
que reciba como argumento un arreglo de tpo double y que invierta 
el contenido del mismo. Eso es, que si los valores originalment eran
1 2 3 4 ahora sean 4 3 2 1.
*/

public class Flipper {
  static double[] array = {1,5,7,9,7,5,3,0,5,-3,-6,12,34,-4,-2};
  static double temp;
  
  public static void main (String[] args) {
    for (int i = 0; i < array.length - i; i++) {
      temp = array[array.length - i - 1];
      array[array.length - i - 1] = array[i];
      array[i] = temp;
    }
    
    System.out.print("Reversed Array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(Array [i] + ", ");
    }
  }
}
