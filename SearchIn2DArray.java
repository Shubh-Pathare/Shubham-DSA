package LinearSearch;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {12,43,55,23,87},
            {53,8,7,98},
            {1,2,3,4,5},
            {90,2873,273,9}
            };
            int target=98;
            System.out.println(Arrays.toString(search(arr,target)));//format is like{row,col}
            System.out.println("Maximum="+Max(arr));
        }
        static int[] search(int[][] arr,int target){
            if(arr.length==0){
                return new int[]{-1};
            }
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col]==target)
                    {
                        return new int[] {row,col};
                    }
                }
            }
            
            return new int[]{-1};
        }
        static int Max(int[][] arr){
            int Max=Integer.MIN_VALUE;
            // for (int row = 0; row < arr.length; row++) {
            //     for (int col = 0; col < arr[row].length; col++) {
            //         if(arr[row][col]>Max)
            //         {
            //             Max=arr[row][col];
            //         }
            //     }
            // }
            for (int[] ints : arr) {
                for (int element : ints) {
                    if(element>Max){
                        Max=element;
                    }
                    
                }
                
            }
            return Max;
        }
        
    }


