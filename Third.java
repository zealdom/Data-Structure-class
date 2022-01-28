public class Third {
  
    static void intercalados (int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for ( int j = 0; j < array[i]; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 0; k < array[i]; k++) {
                    System.out.print("+");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] array = {4,9,6,5,8,8,2,5};
        intercalados(array);
    }
}
