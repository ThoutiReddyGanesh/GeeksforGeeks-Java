class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            int c=rem*rem*rem;
            sum=sum+c;
            n=n/10;
        }
        if(sum==temp)
        return true;
        else return false;
    }
};
    
