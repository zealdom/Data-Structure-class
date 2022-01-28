/*
Modifique ArrayAsterisc.java de form atal que la columna 20 en la pantalla
coppesponda al valor 0. Si el valor en la posicion n en el arreglo es positivo se
 imprimira la cantidad de asteriscos correspondientes a la derecha de esa posicion. 
 Si el valor es negativo entonces se imprimiran a la izquierda de la posicion. 
 En la posicion 20 se imprimira el caracter | Si el valor en la posicion n es 0
 entonces en esa linea solo se imprimira el caracter |. Si el valor es mayor que 20 or menor 
 que -20 solo se imprimiran 20 asteriscos. Si, por ejemplo, el arreglo tuviese los valores. 
*/





public class ArrayAsterisc2 {
  static int[] array = {5,9,-12,5,0,-6,27,-91};
  static int[] array2 = {21,5,7,16,-5,-4,-3,-2,-1,0};
  static int spaceFactor = 0;
  static boolean isNegative;
  static void imprimeArregloEnAsterisco(int[] array) {
      for (int i = 0; i < array.length; i++) {
         if (array[i] < 0) {
            spaceFactor = 20 + array[i];
            array[i] = array[i] * -1;
            isNegative = true;
         } else {spaceFactor = 20;}
      
         for (int s = 0; s < spaceFactor; s++) {
            System.out.print(" ");
            if (s == 19) {
               System.out.print("|");
            }
         }
      
         for (int j = 0; j < array[i]; j++) {
            if ( (array[i] > 20) || (array[i] < -21) ) {
               array[i] = 20;
            }
            System.out.print("*");
         }
         if (isNegative == true) {System.out.print("|");} 
         isNegative = false; 
      
         System.out.println("");
     }// end for
  }// end function
  public static void main (String [] args) {
    imprimeArregloEnAsterisco(array);

  }// end main
}// end class
