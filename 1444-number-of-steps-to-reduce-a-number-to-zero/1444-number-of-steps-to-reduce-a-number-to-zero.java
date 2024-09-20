class Solution {
    int steps;
    public int numberOfSteps(int num) {
        if(num == 0) return steps;
        steps++;
        if(num%2 == 0) return numberOfSteps(num/2);
        else numberOfSteps(num-1);

        return steps;
    }
}