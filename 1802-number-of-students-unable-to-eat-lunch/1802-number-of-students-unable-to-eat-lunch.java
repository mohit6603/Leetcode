class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0;
        int zeros = 0;
        for(int i = 0; i<students.length; i++){
            if(students[i] == 1) ones++;
            else zeros++;
        }

        for(int i = 0; i<sandwiches.length; i++){
            if(sandwiches[i] == 0 && zeros == 0 || sandwiches[i] == 1 && ones == 0) break;
            if(sandwiches[i] == 0 && zeros >= 1) zeros--;
            else if(sandwiches[i] == 1 && ones >= 1) ones--;
        }

        return zeros+ones;
    }
}