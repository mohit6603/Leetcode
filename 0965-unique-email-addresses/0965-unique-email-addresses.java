class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        int count = 0;

        for(String s : emails){
            int addIndex = s.indexOf('@');
            int plusIndex = s.indexOf('+');
            String str = "";

            if(plusIndex >= 0){
                str = s.substring(0, plusIndex);
            }
            else{
                str = s.substring(0, addIndex);
            }

            str = str.replace(".", "") + s.substring(addIndex);

            if(set.add(str)) count++;
        }

        return count;
    }
}

//space = 0(n) + 0(n)
//time = 