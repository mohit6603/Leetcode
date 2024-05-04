class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char th[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(th);

        return Arrays.equals(th, ch);

    }
}