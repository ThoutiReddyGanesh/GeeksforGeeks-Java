class Solution {
    sumOfAP(n, a, d) {
        // code here
        let sum=0;
        for(let i=1;i<=n;i++){
        let s=(a+(i-1)*d);
        sum=sum+s;}

        return (sum);
    }
}
