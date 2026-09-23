class Solution {
    public static boolean checkPangram(String s) {
        // code here
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch>='a' && ch<='z'){
            int x=ch-'a';
            arr[x]++;}
        }
            for(int i=0;i<26;i++){
                if(arr[i]==0)return false;
            }
        return true;
    }
}