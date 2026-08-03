class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
         * int n = nums.length;
         * int l[]=new int[n];
         * int r[]=new int[n];
         * int res[]=new int[n];
         * l[0]=1;
         * for(int i=1;i<n;i++)
         * {
         * l[i]=l[i-1]*nums[i-1];
         * }
         * r[n-1]=1;
         * for(int i=n-2;i>=0;i--)
         * {
         * r[i]=r[i+1]*nums[i+1];
         * }
         * 
         * for(int i=0;i<n;i++)
         * {
         * res[i]=l[i]*r[i];
         * }
         * return res;
         * }
         */
        /*
         * int sum=1;
         * ArrayList<Integer> a1 = new ArrayList<Integer>();
         * for(int i=0;i<nums.length;i++)
         * {
         * sum=1;
         * for(int j=0;j<nums.length;j++)
         * {
         * if(i!=j){
         * sum=sum*nums[j];
         * }
         * }
         * a1.add(sum);
         * 
         * 
         * }
         * int res[]=new int[a1.size()];
         * for(int i=0;i<a1.size();i++)
         * {
         * res[i]=a1.get(i);
         * }
         * return res;
         * 
         * 
         * }
         */

        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        l[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }
        r[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r[i] * l[i];
        }
        return nums;

    }
}