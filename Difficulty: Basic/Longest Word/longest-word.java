class Solution {
    public String longest(String[] arr) {
        String s="";
        int c=0;

        for(int i=0;i<arr.length;i++){
            int x=arr[i].length();
            if(x>c){
                c=x;
                s=arr[i];
            }
        }

        return s;
    }
}