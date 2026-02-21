class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> nos = new HashSet<>();
        int len = nums.length;
        int starting;
        int max = 1;
        int currLen;
        if(len == 0){
            return 0;
        }
        for(int i = 0; i < len; i++){
            nos.add(nums[i]);
        }
        for(int num : nos){
            int current = num;
            if(nos.contains(current-1)){
                continue;
            }
            starting = current;
            currLen = 1;
            while(nos.contains(starting+1)){
                    currLen++;
                    starting++;
                    if(currLen > max){
                        max = currLen;
                    }
                } 
        }
        return max;
    }
}
