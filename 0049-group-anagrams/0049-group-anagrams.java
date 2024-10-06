class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char ch[] = new char [26];
            for(char c : s.toCharArray()){
                ch[c - 'a']++;
            }

            String keyStr = new String(ch);

            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

// time = 0(n.k)
// o(m+n)