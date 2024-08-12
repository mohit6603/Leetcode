class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(helper(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean helper(String w1, String w2){
        return w2.startsWith(w1) && w2.endsWith(w1);
    }
}