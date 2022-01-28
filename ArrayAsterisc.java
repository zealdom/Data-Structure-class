/* 
Escriba un programa que contenga uan funcion (de nombre imprimeArregloEnAsteriscos) que 
reciba como argumento un arregla de valores enteros. Por cada valor en el arreglo la funcion imprimira una 
linea de asteriscos donde elnumera de asteriscos en la linea n corresponde al valor en la 
posicion n del arreglo. 
*/


public class ArrayAsterisc {
  static int[] array = {5,3,8,4};
  
  public statc void main (String [] args) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i]; j++) {
        System.out.print("*");
     }
     System.out.println("");
    }
  }
}
