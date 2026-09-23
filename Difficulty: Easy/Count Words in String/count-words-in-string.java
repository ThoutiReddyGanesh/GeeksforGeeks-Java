class Solution {
    public int countWords(String s) {
        // code here
        int c=0;
        s = s.trim();
        if (s.isEmpty()) 
            return 0;
        String[] words = s.split("\\s+");
        for (String word : words)
            c++;
        return c;
    }
}