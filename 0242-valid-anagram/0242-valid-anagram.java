class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int nums[] = new int[26];
        for(char c : s.toCharArray()){
            nums[c-'a']++;
        }

        for(char c : t.toCharArray()){
            nums[c-'a']--;
        }

        for(int  i : nums){
            if(i>0) return false;
        }

        return true;
    }
}