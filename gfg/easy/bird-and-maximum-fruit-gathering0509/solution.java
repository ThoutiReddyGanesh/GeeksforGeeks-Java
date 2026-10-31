class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        // code here
        if(totalTime>=arr.length){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            return sum;
        }

        int sum=0;
        for(int i=0;i<totalTime;i++){
            sum=sum+arr[i];
        }
        int m=sum;
        for(int j=totalTime;j<arr.length;j++){
            sum=sum+arr[j]-arr[j-totalTime];
            m=Math.max(m,sum);

        }
        return m;

    }
}
