class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str: strs){
            s.append(str.length()).append("@").append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> decoded = new ArrayList<>();
        while (i < str.length()){
            StringBuilder l = new StringBuilder();
            while(str.charAt(i) != '@'){
                l.append(str.charAt(i));
                i++;
            }
            i++; //skip '@'
            int stopIdx = i + Integer.parseInt(l.toString());
            StringBuilder s = new StringBuilder();
            while(i < stopIdx ){
                s.append(str.charAt(i));
                i++;
            }
            decoded.add(s.toString());
        }
        return decoded;
    }
}
