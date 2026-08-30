class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n;
            int rev=0;
            
            while(n!=0){
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
                }
            if(temp==rev)return true;
        return false;
    }
}