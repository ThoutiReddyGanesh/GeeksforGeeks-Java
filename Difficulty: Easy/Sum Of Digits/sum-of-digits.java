class Solution {
    static int sumOfDigits(int n) {
        // code here
        int s=String.valueOf(n).chars().map(x->x-'0').sum();
        return s;
    }
}
