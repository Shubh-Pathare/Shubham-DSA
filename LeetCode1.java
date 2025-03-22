package LinearSearch;

public class LeetCode1 {
    public static void main(String[] args) {
        int[][] arr={{1,3,4},{1,2,3,5},{7,8}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts){
        int Max=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+=accounts[person][account];
            }
            if(Max<sum){
                Max=sum;
            }
        }
        return Max;
    }
}
