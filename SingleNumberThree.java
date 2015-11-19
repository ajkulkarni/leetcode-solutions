public class Solution {
    public int[] singleNumber(int[] nums) {

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++) {

            if(m.containsKey(nums[i]))
            m.remove(nums[i]);

            else
            m.put(nums[i],1);

        }

        int[] a= new int[2];

        Iterator it = m.keySet().iterator();
        int i=0;
        while(it.hasNext()) {
            a[i]=(int)it.next();
            i++;
        }

        return a;
    }
}
