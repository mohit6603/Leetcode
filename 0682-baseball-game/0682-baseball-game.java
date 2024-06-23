class Solution {
    int score;

    public int calPoints(String[] operations) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];

            if (operation.equals("C")) {
                if (!al.isEmpty()) {
                    al.remove(al.size() - 1);
                }
            } else if (operation.equals("D")) {
                if (al.size() >= 1) {
                    al.add(al.get(al.size() - 1) * 2);
                }
            } else if (operation.equals("+")) {
                if (al.size() >= 2) {
                    int sum = al.get(al.size() - 1) + al.get(al.size() - 2);
                    al.add(sum);
                }
            } else {
                String s = operation;
                al.add(Integer.parseInt(s));
            }
        }

        for (int i = 0; i < al.size(); i++) {
            score += al.get(i);
        }
        return score;
    }
}
