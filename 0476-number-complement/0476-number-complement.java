class Solution {
    public int findComplement(int num) {
        int l = Integer.toBinaryString(num).length();
        int helper = (1<<l)-1;

        return helper^num;

    }
}