class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }

        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        Map<Character, Integer> seen = new HashMap<>();
        int maxLength = 0;
        while(end < chars.length){
            if(seen.containsKey(chars[end])){
                int newStart = seen.get(chars[end]) + 1;
                start = start < newStart ? newStart : start;
            }
            seen.put(chars[end], end);
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}
