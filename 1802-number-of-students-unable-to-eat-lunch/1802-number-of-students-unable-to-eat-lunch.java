class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero = 0;
        int one = 0;
        int ans = 0;
        int n = sandwiches.length;

        for(int i : students){
            if(i == 0) zero++;
            else one++;
        }

        for(int i = 0; i<sandwiches.length; i++){
            if((sandwiches[i] == 0 && zero == 0) || (sandwiches[i] == 1 && one == 0)){
                ans = n-i;
                break;
            }

            else if(sandwiches[i] == 0 && zero > 0){
                zero--;
            }
            else if(sandwiches[i] == 1 && one > 0){
                one--;
            }

        }

        return ans;
    }
}