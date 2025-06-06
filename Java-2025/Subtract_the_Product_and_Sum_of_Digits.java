class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int num=n;
        while(n>0){
            num = n%10;
            n = n/10;
            product *= num;
            sum += num;
        }
        int res = product - sum;
        return res;
    }
}
