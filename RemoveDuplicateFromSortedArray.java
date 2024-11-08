public class RemoveDuplicateFromSortedArray {

    // Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
    // each unique element appears only once. The relative order of the elements should be kept the same. 
    // Then return the number of unique elements in nums.

    // Consider the number of unique elements of nums to be k, to get accepted, you need to do the 
    // following things:
    
    // Change the array nums such that the first k elements of nums contain the unique elements in the 
    // order they were present in nums initially. The remaining elements of nums are not important as 
    // well as the size of nums.
    // Return k

    public static int removeDuplicate(int[] nums){
        int k = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that 
    // each unique element appears only once. The relative order of the elements should be kept the same. 
    // Then return the number of unique elements in nums.

    // Consider the number of unique elements of nums to be k, to get accepted, you need to do the following 
    // things:

    // Change the array nums such that the first k elements of nums contain the unique elements in the order 
    // they were present in nums initially. The remaining elements of nums are not important as well as the 
    // size of nums.
    // Return k

    public static int removeDuplicateElement(int[] nums){
        int n = nums.length;
        if(n <= 2){
            return n;
        }

        int k = 2; 
        for(int i = 2; i<n; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
