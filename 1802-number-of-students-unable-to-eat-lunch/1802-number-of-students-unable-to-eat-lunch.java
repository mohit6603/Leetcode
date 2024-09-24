class Solution {

    //simulate--approch
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sand = new Stack<>();
        for(int i = students.length-1; i >= 0; i--){
            sand.push(sandwiches[i]);
        }

        Queue<Integer> stud = new LinkedList<>();
        for(int i : students){
            stud.add(i);
        }

        int noteat = 0;
        while(!stud.isEmpty() && noteat < stud.size()){
            if(sand.peek() == stud.peek()){
                sand.pop();
                stud.poll();
                noteat = 0;
            }
            else{
                stud.add(stud.peek());
                stud.poll();
                noteat++;
            }
        }

        return stud.size();

    }
}
