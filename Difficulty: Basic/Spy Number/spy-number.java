class Solution {
    public boolean checkSpy(int n) {
        // code here
        int sum=0;
        int pro=1;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        if(sum==pro) return true;
        return false;
    }
}
