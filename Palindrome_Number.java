class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int xx = x;
        while(x>0){
            rev = (rev*10)+(x%10);
            x = x/10;
        }
        if(xx==rev){
            return true;
        }
        else{
            return false;
        }
    }
}
