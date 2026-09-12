class Solution {
    public boolean isSubSeq(String s, String t) {
        // code here
        int i=0;
               int j=0;
               while(i<s.length() && j<t.length()){
                   if(s.charAt(i)==t.charAt(j)){
                   i++;j++;}
                   else j++;
               }
               return i==s.length();
           }
       }