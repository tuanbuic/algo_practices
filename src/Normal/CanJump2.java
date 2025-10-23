package Normal;

/*You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.*/
public class CanJump2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4, 2, 1, 1, 3, 2, 1};
        System.out.println(canJump(nums));
    }

    public static int canJump(int[] nums) {
        int jumps=0;int near=0; int far =0;
        while(far<nums.length){
            int farthest = 0;
            for(int i=near;i<=far;i++){
                farthest= Math.max(farthest,i+nums[i]);
            }
            near = far+1;
            far=farthest;
            jumps++;
        }
        return jumps;
    }


}