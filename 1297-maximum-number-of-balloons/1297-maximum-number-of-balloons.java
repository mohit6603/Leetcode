class Solution {
    public int maxNumberOfBalloons(String text) {
        int bcount = 0;
        int acount = 0;
        int lcount = 0;
        int ocount = 0;
        int ncount = 0;

        // Count the occurrences of each letter
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case 'b': bcount++; break;
                case 'a': acount++; break;
                case 'l': lcount++; break;
                case 'o': ocount++; break;
                case 'n': ncount++; break;
            }
        }

        // Since 'l' and 'o' are required twice, we need to divide their counts by 2
        lcount /= 2;
        ocount /= 2;

        // The maximum number of "balloon" we can form is determined by the limiting factor
        return Math.min(Math.min(bcount, acount), Math.min(lcount, Math.min(ocount, ncount)));
    }
}
