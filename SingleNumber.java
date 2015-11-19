public class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        int cur=0;

        for (int i = 0; i < nums.length; i++)
        {
            if (!m.containsKey(nums[i]))
                m.put(nums[i], 1);

            else
                m.remove(nums[i]);

        }

        Iterator it = m.keySet().iterator();
        while (it.hasNext()) {
            cur = (int)it.next();
        }

        return cur;
    }
}
