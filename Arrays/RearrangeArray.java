class Solution {
    public int[] RearrangeArray(int[] nums) {
        /*
         * List<Integer> p = new ArrayList<>();
         * List<Integer> n = new ArrayList<>();
         * List<Integer> f = new ArrayList<>();
         * for(int i=0;i<nums.length;i++)
         * {
         * if(nums[i]>=0)
         * {
         * p.add(nums[i]);
         * }
         * else
         * {
         * n.add(nums[i]);
         * }
         * }
         * int k = 0;
         * int z=0;
         * for(int i=0;i<nums.length;i++)
         * {
         * if(i%2==0){
         * f.add(p.get(k));
         * k++;
         * }
         * //k++;
         * //i++;
         * else
         * {
         * f.add(n.get(z));
         * z++;
         * }
         * }
         * 
         * /*for(int i=1;i<nums.length;i++)
         * {
         * f.add(n.get(z));
         * z++;
         * i++;
         * }
         */
        // for(int i=0;i<nums.length;i++)
        // {
        // nums[i]=f.get(i);
        // }
        // System.out.println(Arrays.deepToString(f.toArray(new Integer[0])));
        // return nums;*/

        int p[] = new int[nums.length / 2];
        int n[] = new int[nums.length / 2];
        int z = 0;
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                p[z] = nums[i];
                z++;
            } else {
                n[y] = nums[i];
                y++;
            }
        }
        z = 0;
        y = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = p[z];
                z++;
            } else {
                nums[i] = n[y];
                y++;
            }
        }
        return nums;

    }
}