class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }

        char[] chars = s.toCharArray();
        Map<Character, Integer> seen = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++){
            if(seen.containsKey(chars[i])){
                start = Math.max(start, seen.get(chars[i]) + 1);
            }
            seen.put(chars[i], i);
            maxLength = Math.max(maxLength, i-start + 1);
        }
        return maxLength;
    }
}
