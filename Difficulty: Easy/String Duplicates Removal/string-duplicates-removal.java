class Solution {
    String removeDuplicates(String s) {
        String ans="";

        for(int i=0;i<s.length();i++){
            if(ans.indexOf(s.charAt(i))==-1)
                ans+=s.charAt(i);
        }
        return ans;
    }
}