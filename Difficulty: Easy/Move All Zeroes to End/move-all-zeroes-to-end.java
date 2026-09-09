class Solution {
    void pushZerosToEnd(int[] a) {
        // code here
        int d=0;
                int i=0;
                int j=0;
                for(i=0;i<a.length;i++){
                    if(a[i]!=0){
                        d++;
                        a[j]=a[i];
                        j++;}
                }


                for(i=d;i<a.length;i++) a[i]=0;

            }
        }
        
    