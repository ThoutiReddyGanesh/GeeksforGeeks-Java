class Solution {
    public String isAutomorphic(int n) {
        // code here
      int sq=n*n;
      int temp=n;
      int dig=0;
      while (temp>0) {
          dig++;
          temp=temp/10;
      }

      int power=1;

      for (int i=0;i<dig;i++) {
          power=power* 10;
      }

      if(sq%power == n)
      return "Automorphic";
      else  return "Not Automorphic";
    }
}