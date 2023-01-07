/**
 * Question Link:
 * https://leetcode.com/problems/rotate-function/description/
 */
public class MicroSoft_4 {


    
        public int maxRotateFunction(int[] nums) {
            int F =0;
            int sum =0;
    
            for(int i=0;i<nums.length;i++){
                sum = sum + nums[i];
                F = F + i * nums[i];
            }
    
            int max = F;
            for(int i = nums.length-1; i >= 1; i--){
                F = F + sum - nums.length * nums[i];
                max = Math.max(F,max);
            }
            return max;
        }
    
    
}
