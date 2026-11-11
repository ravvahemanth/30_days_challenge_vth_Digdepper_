class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Set<List<Integer>> st = new HashSet<>();
        int n=num.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(num[i] + num[j]);

                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(num[i], num[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hashset.add(num[j]);
            }
        }

        return new ArrayList<>(st);
    
    }
}