class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) 
            continue;
            int current = nums[i];
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int sum = current + nums[left] + nums[right];
                if(sum < 0){
                    left ++;
                }
                else if(sum > 0){
                    right --;
                }
                else
                {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(current);
                    inner.add(nums[left]);
                    inner.add(nums[right]);
                    output.add(inner);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) 
                    left++;
                    while(left < right && nums[right] == nums[right+1])                right--;
                }
            }
        }
        return output;
    }
}