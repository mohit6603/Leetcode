class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue<Integer> stud = new LinkedList<>();
        for(int stu : students){
            stud.add(stu);
        }

        Stack<Integer> sand = new Stack<>();
        for(int i = sandwiches.length-1; i>=0; i--){
            sand.push(sandwiches[i]);
        }

        int served = 0;
        while(!stud.isEmpty() && served < stud.size()){
            if(sand.peek() == stud.peek()){
                sand.pop();
                stud.poll();
                served = 0;
            }
            else{
                stud.add(stud.peek());
                stud.poll();
                served++;
            }
        }
        return stud.size();
    }
}