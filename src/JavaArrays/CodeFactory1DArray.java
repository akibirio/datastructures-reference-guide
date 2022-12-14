package JavaArrays;

/**
 * CodeFactory2DArray
 */
public class CodeFactory1DArray {
    // here I define a 1 dimension array. It's index based. Indes IDs start from 0.
    // arrays check if the length of the id is 0 to make sure you dont run to IndexOutOfBoundary exception
    public static void main(String[] args) {
        int i = 0;
        int[] sizes = {24, 67, 89, 90, 102};
        
        //print all sizes one by one using enhanced for loop
        for(int size : sizes){
            System.out.println("Size at Position " + i + " of 1D array is : " +size);
            i++;
        }
      }

    
}