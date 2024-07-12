class Solution {
    int steps = 0;
    public int numberOfSteps(int num) {
        if(num == 0) return 0;

        if(num%2 == 0) {
            steps++;
            numberOfSteps(num/2);
        }
        else{
            steps++;
            numberOfSteps(num-1);
        }

        return steps;
    }
}