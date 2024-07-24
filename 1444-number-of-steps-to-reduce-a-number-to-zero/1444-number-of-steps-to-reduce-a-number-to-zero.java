class Solution {
    int steps = 0;
    public int numberOfSteps(int num) {
        if(num == 0){
            return steps;
        }

        else if(num%2 == 0){
            steps++; 
            return numberOfSteps(num/2);
        }

        else{
            steps++; 
            return numberOfSteps(num-1);
        }
        //return steps;
    }
}