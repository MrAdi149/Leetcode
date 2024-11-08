
import java.util.Arrays;

public class MajorityElement {
    // Given an array nums of size n, return the majority element.

    // The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that 
    // the majority element always exists in the array.

    public static int majority(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
