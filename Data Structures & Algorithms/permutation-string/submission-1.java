class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        int[] sc = new int[26];

        for(char c : s1.toCharArray()){
            sc[c-'a']++;
        }

        int[] s2c = new int[26];
        
        for (int i = 0; i < s1.length(); i++){
            char c = s2.charAt(i);
            s2c[c - 'a']++;
        }

        if(Arrays.equals(sc, s2c)){
            return true;
        }

        int s = 0, e = s1.length();
        
        while(e < s2.length()){
            char cs = s2.charAt(s);
            char ce = s2.charAt(e);
            s2c[cs - 'a']--;
            s2c[ce - 'a']++;
            if (Arrays.equals(sc, s2c)){
                return true;
            }
            s++;
            e++;
        }
        return false;
    }
}
