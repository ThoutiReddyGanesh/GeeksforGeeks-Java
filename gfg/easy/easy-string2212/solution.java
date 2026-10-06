class Solution {
    public String compressString(String s) {
        int i=0;
        int j=0;
        int c=0;
        String d="";

        while(j<s.length()){
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                c++;
                j++;
            }
            else{
                d+=Character.toLowerCase(s.charAt(i));
                d+=c;
                c=0;
                i=j;
            }
        }

        d+=Character.toLowerCase(s.charAt(i));
        d+=c;

        return d;
    }
}