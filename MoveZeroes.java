public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if(nums[i] != 0)
                break;

                if((j+i+1) < nums.length)
                {
                if (nums[i]!=nums[j+i+1])
                {
                    nums[i]=nums[j+i+1];
                    nums[j+i+1] = 0;
                }
                }
            }
        }
    }
}
