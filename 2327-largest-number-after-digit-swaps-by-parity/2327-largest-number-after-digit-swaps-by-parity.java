class Solution {
    public int largestInteger(int num) {
        String s = ""+num;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int n = Character.getNumericValue(ch);
            if(n%2 == 0){
                even.add(n);
            }
            else{
                odd.add(n);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        String ss = "";
        int p1 = 0;
        int p2 = 0;

        for(int i = 0; i<s.length(); i++){
            int n = Character.getNumericValue(s.charAt(i));
            if(n%2 == 0){
                ss += even.get(p1);
                p1++;
            }
            else{
                ss += odd.get(p2);
                p2++;
            }
        }
        return Integer.parseInt(ss);

    }
}