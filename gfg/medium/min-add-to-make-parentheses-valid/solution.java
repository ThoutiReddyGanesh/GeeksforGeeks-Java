class Solution {
    public int minParentheses(String s) {
        int i=0;
        int oc=0;
        int cc=0;
        while(i<s.length()){
            if(s.charAt(i)=='(')
                oc++;
            else{
                if(oc>0)
                    oc--;
                else
                    cc++;
            }
            i++;
        }
        return oc+cc;
    }
}