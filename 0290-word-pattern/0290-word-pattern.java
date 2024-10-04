class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        if(words.length != pattern.length()) return false;

        Map<Character, String> CmapS = new HashMap<>();
        Map<String, Character> SmapC = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(!CmapS.containsKey(ch)){
                CmapS.put(ch, word);
            }

            if(!SmapC.containsKey(word)){
                SmapC.put(word, ch);
            }

            if(!CmapS.get(ch).equals(word) || !SmapC.get(word).equals(ch)){
                return false;
            }
        }
        return true;

    }
}
