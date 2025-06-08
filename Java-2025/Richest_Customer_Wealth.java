class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] total = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                total[i] = total[i]+accounts[i][j];
            }
        }
        int max=0;
        for(int i=0;i<total.length;i++){
            if(total[i]>max){
                max=total[i];
            }
        }
        return max;
    }
}
