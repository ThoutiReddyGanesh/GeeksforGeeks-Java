class Solution {
    public char nonRepeatingChar(String s) {
        // code here
    int arr []=new int[128];
    for(int i=0;i<s.length();i++){
        arr[s.charAt(i)]++;
            }
    for(int i=0;i<s.length();i++){
        if(arr[s.charAt(i)]==1)
        return s.charAt(i);
    }
            return '$';
        }
    }    