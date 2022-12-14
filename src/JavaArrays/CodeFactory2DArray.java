package JavaArrays;

import java.util.Arrays;

public class CodeFactory2DArray {
    // adding an implementaion of a two dimension array

    public static void main(String[] args) {
        // signature
        int[][] ticTacToeBoard = {{0,0,0},{0,0,0},{0,0,0}};

        //loop through 3 d using enhanced for loop
        for(int[] iBoard : ticTacToeBoard){
            System.out.print(Arrays.toString(iBoard));
        }
        
    }
    
}
