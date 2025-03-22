package LinearSearch;

public class LeetCode {
    public static void main(String[] args) {
        int[] arr = { 23, 1, 5433, 54323456, 32, 1, 34, 0 };
        System.out.println(FindEvenNumbers(arr));
    }
    

    static int FindEvenNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int digit = FindDigit(num);
        // if(digit%2==0){
        // return true;
        // }
        // return false;
        return digit % 2 == 0;
    }

    static int FindDigit(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if(num==0){
            return 1;
        }
        return (int) (Math.log10(num) + 1);
    }
    // static int FindDigit(int num){
    // int count=0;
    // if(num<0){
    // num=num*-1;
    // }
    // if(num==0){
    // return 1;
    // }
    // while (num>0) {
    // count++;
    // num/=10;
    // }
    // return count;
    // }
}
