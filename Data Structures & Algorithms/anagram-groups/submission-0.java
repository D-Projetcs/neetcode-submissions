class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /**
        create a key and put in map (make sure the key is alphabetically sorted)
        traverse the map and create list of list and return
        'a1c1t1' -> [act]
        'p1o1t1s1' -> [pots]
        **/
        List<List<String>> s = new ArrayList<>();
        Map<String, List<String>> m = new HashMap<>();

        for(String str: strs){
            int[] key = new int[26];
            StringBuilder hash = new StringBuilder();
            for(char c : str.toCharArray()){
                key[c - 'a']++;
            }
            for(int i = 0; i < key.length; i++){
                if(key[i] > 0){
                    hash.append((char)(i + 'a')).append(key[i]);
                }
            }
            String h = hash.toString();
            List<String> l = m.getOrDefault(h, new ArrayList<>());
            l.add(str);
            m.put(h, l);
        }
        for(String k: m.keySet()){
            s.add(m.get(k));
        }
        return s;
        
    }
}
