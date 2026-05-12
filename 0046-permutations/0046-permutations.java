class Solution {

    public void helper(int[] nums, List<List<Integer>> ans, int idx){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int x : nums){
                temp.add(x);
            }
            ans.add(temp);
            return;
        }

        for(int i = idx; i < nums.length; i++){
            int t = nums[i];
            nums[i] = nums[idx];
            nums[idx] = t;

            helper(nums, ans, idx + 1);

            t = nums[i];
            nums[i] = nums[idx];
            nums[idx] = t;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, 0);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna