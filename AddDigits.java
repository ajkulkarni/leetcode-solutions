public class Solution {
    public int addDigits(int num) {

        int n=num;

        if (num == 0)
        return num;

        if (num%9 == 0)
        return 9;

        while(n%9 != 0)
        {
            n--;
        }

        return num-n;
    }
}
