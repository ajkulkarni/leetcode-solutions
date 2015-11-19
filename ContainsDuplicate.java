public class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i]))
            return true;
            m.put(nums[i],1);

        }

        return false;

    }
}
