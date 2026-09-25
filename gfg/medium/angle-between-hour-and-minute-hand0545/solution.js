class Solution {
    getAngle(s) {
        // code here
        let h=Number(s.substring(0, 2));
        let m=Number(s.substring(3, 5));
        h=h%12;
        let angle = Math.abs(30 * h - 5.5 * m);
        if(angle>180)
            angle=360-angle;

        return angle;
    }
}
