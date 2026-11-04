class Solution {
    public int maxArea(int[] h) {
        int s = 0;
        int e = h.length - 1;
        int maxCap = 0;
        while(s < e){
            maxCap = Math.max(maxCap,(e - s) * Math.min(h[s], h[e]));
            if(h[s] < h[e])
                s++;
            else
                e--;
        }
        return maxCap;
    }
}
