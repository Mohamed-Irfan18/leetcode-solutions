class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                Set<Integer> set = new HashSet<>();
                for (int k = j + 1; k < len; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long fourth = (long) target - sum;
                    if (fourth >= Integer.MIN_VALUE && fourth <= Integer.MAX_VALUE && set.contains((int)fourth)){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        //Collections.sort(temp);
                        res.add(temp);
                    }
                    set.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(res);
    }
}