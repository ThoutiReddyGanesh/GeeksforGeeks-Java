class Solution {
    public int lcm(int a,int b){
        int x=a;
        int y=b;
        while(y!=0){
            int temp=x%y;
            x=y;
            y=temp;
        }
        return (a*b)/x;
    }
}