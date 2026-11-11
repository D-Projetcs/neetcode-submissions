class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, ml = 0, mcc = 0;
        int[] cc = new int[26];
        while(r < s.length()){
            char c = s.charAt(r);
            cc[c - 'A']++;
            mcc = Math.max(mcc, cc[c - 'A']);
            while(r - l + 1 - mcc > k){
                char cl = s.charAt(l);
                cc[cl - 'A']--;
                l++;
            }
            ml = Math.max(ml, r - l + 1);
            r++;
        }
        return ml;
    }
}
