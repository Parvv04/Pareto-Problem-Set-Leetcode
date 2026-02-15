class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] answer = new int[len];
        left[0] = 1;
        answer[len-1] = 1;
        for(int i = 1; i < len; i++){
            left[i] = left[i-1] * nums[i-1];  
        }
        for(int j = len-2; j >= 0; j--){
            answer[j] = answer[j+1] * nums[j+1];
        }
        for(int k = 0; k < len; k++){
            answer[k] *= left[k];
        }
        return answer;
    }
}