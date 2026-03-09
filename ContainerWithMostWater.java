class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int min = height[0];
        int maxArea = 0;
        int area = 0;
        while(left < right){
            min = height[left] < height[right] ? height[left] : height[right];
            area = min * (right - left);
            maxArea = area > maxArea ? area : maxArea;
            if(height[left] < height[right]){
                left ++;
            }
            else{
                right --;
            }
        }
        return maxArea;
    }
}

