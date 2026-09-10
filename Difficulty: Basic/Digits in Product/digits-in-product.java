class Solution {
    public int countDigits(int a, int b) {
        // code here
        long pro=(long)a*b;
        int c=0;
        if(pro<0)
            pro=pro*-1;
        if(pro==0)
            return 1;
        while(pro>0){
            pro=pro/10;
            c++;}
        return c;
    }
}