class Solution {
    public int maxProduct(int[] nums) {
        /*
         * int p=1; Brute fore
         * int m=Integer.MIN_VALUE;
         * for(int i=0;i<nums.length;i++)
         * {
         * p=1;
         * for(int j=i;j<nums.length;j++)
         * {
         * p=p*nums[j];
         * m=Math.max(p,m);
         * 
         * }
         * m=Math.max(p,m);
         * 
         * }
         * 
         * return m;
         */
        /*
         * int p = 1;
         * for(int i=0;i<nums.length;i++)
         * {
         * p=p*nums[i];
         * 
         * }
         */

        int l = 1;
        int r = 1;
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (l == 0) {
                l = 1;
            }
            if (r == 0) {
                r = 1;
            }
            l = l * nums[i];
            r = r * nums[nums.length - i - 1];
            m = Math.max(m, Math.max(l, r));// for minimum just use min
        }
        return m;
    }
}