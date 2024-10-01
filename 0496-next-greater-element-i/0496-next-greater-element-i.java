class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        //saare next greater find and store in n2
        for(int i : nums2){
            while(!st.isEmpty() && st.peek() < i){
                map.put(st.pop(), i);
            }
            st.push(i);
        }

        //fill ans arr
        int ans[] = new int [nums1.length];
        for(int i = 0; i< nums1.length; i++){
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}

//tc = o(m+n)