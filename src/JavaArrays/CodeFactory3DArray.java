package JavaArrays;

public class CodeFactory3DArray {
    public static void main(String[] args) {
        //create a 3d array
        int[][][] threeDArray = {{{1, -2, 3}, {2, 3, 4}}, {{-4,-5,6,9},{1},{2,3}}};

        // using for...each to loop through elements of 3d array
        for (int[][] array2D : threeDArray) {
            for (int[] array1D : array2D) {
                for (int element : array1D) {
                    System.out.println(element);
                }
                
            }
            
        }

    }
    
}
