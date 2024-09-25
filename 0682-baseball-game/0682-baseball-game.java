//simulation tc = 0(n) + 0(n)
// sc = 0(n);

class Solution {
    public int calPoints(String[] ops) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < ops.length; i++){
            String s = ops[i];

            if(s.equals("+")){
                int j = list.get(list.size()-1) + list.get(list.size()-2);
                list.add(j);
            }

            else if (s.equals("C")){
                list.remove(list.size()-1);
            }
            else if (s.equals("D")){
                int j = list.get(list.size()-1);
                list.add(2*j);
            }
            else{  
                list.add(Integer.parseInt(s));
            }
        }

        
        for(int i : list){
            ans += i;
        }

        return ans;
    }
}