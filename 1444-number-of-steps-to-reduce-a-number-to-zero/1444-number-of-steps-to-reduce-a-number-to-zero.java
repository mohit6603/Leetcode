class Solution {
    public int count = 0;
    public int numberOfSteps(int num) {
        if(num == 0){
            return count;
        }

        if(num%2 == 0){
            count++;
            return numberOfSteps(num/2);
        }
        else{
            count++;
            return numberOfSteps(num-1);
        }
    }
}