package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={21,3,43,1,32,35};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr){
       int Min=arr[0];
       for (int i = 0; i < arr.length; i++) {
            if(arr[i]<Min){
                Min=arr[i];
            }
       }
       
        return Min;
    }
}
