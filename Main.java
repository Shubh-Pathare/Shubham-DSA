package LinearSearch;

public class Main {
  public static void main(String[] args) {
    int[] arr={21,32,12,65,1,23,876,90,-1};
    int target=1;
    System.out.println(LinearSearch(arr,target,1,4));
  }
  static int LinearSearch(int[] arr,int target,int start,int end){
    if(arr.length==0){
        return -1;
    }
    for (int index = start; index <= end; index++) {
        int element=arr[index];
        if(element==target){
            return index;
        }
    }
    return -1;
  }
  static int LinearSearch1(int[] arr,int target){
    if(arr.length==0){
        return -1;
    }
    for (int element : arr) {
        if(element==target){
            return element;
        }
    }   
    return -1;
  }
  static boolean LinearSearch2(int[] arr,int target){
    if(arr.length==0){
        return false;
    }
    for (int element : arr) {
        if(element==target){
            return true;
        }
    }
    return false;
  }
}
