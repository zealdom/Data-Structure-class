public class SecondProgram {

       static String compara (int first, int second, int [] third) {
         boolean noWin = false, firstWins = false, secondWins = false;
         int countFirst = 0, countSecond = 0;
         
         for (int i = 0; i < third.length; i++) {
            if (third[i] == first){
               countFirst++;
            } else if (third[i] == second) {
               countSecond++;
            }            
         }
         
         if (countFirst > countSecond){
            firstWins = true;
         } else if (countSecond > countFirst) {
            secondWins = true;
         } else if (countFirst == countSecond ) {
            noWin = true;
         }
         
         if (firstWins) {
            return ("1");
         } else if (secondWins) {
            return ("2");
         } else if (noWin) {
            return ("0");
         } else {
             return (null);
         } 
      }// end method
   public static void main (String [] args) {
      int [] array = {5,3,3,4,3,3,3,3,3,5,7,5};  
      
      String x = compara(3, 5, array);
      
      System.out.println(x);
   }
}
