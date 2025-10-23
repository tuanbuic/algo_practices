package Normal;

import java.util.Arrays;
import java.util.HashSet;

/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]*/
public class RotateArray {
    public static void main(String[] args) {
        //Temporary array approach
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int max = nums.length;
        k = k % nums.length;
//        int[] rotated = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            rotated[(i + k) % nums.length] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = rotated[i];
//        }
        //reverse array approach
        reverse(nums,0,max-1);
        reverse(nums,0,k-1);
        reverse(nums,k,max-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArray(int[] nums, int k) {

        // int[] result = new int[a.length + b.length + c.length];
        // System.arraycopy(b, 0, result, 0, b.length);
        // System.arraycopy(c, 0, result, c.length, b.length);
        //     System.arraycopy(a, 0, result, a.length, b.length);
    }

    public static void reverse(int[] arr, int start, int end ){
        while(start< end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] =temp;
            start++;
            end--;
        }

    }


}