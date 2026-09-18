class Solution{
    public ArrayList<Integer> fibonacciNumbers(int n){
        ArrayList<Integer> list=new ArrayList<>();

        if(n>=1)
            list.add(0);

        if(n>=2)
            list.add(1);

        int a=0;
        int b=1;

        for(int i=2;i<n;i++){
            int c=a+b;
            list.add(c);
            a=b;
            b=c;
        }

        return list;
    }
}