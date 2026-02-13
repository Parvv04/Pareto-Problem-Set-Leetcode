class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        int[] array = new int[2];
        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(sum.containsKey(remaining)){
                return new int[]{sum.get(remaining), i};
            }
            else{
                sum.put(nums[i] , i);
            }
        }
        return null;
    }
}