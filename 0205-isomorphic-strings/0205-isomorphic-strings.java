class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> stmap = new HashMap<>();
        Map<Character, Character> tsmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            //s >> t
            if(stmap.containsKey(schar)){
                if(stmap.get(schar) != tchar) return false;
            }
            else{
                stmap.put(schar, tchar);
            }

            //t >> s
            if(tsmap.containsKey(tchar)){
                if(tsmap.get(tchar) != schar) return false;
            }
            else{
                tsmap.put(tchar, schar);
            }
        }

        return true;
    }
}

// tc = o(n); sc=o(n)