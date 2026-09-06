class Solution {
    public boolean isPalinSent(String s) {
        // code here
                String t=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
                int i=0;int j=t.length()-1;
                      while(i<j){
                          if(t.charAt(i)==t.charAt(j)){
                              i++;
                              j--;}
                          else return false;
                      }
                   return true;
                   }
                       }