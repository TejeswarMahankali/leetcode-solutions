class Solution {
    public int Maximumsumarray(int[] nums) {
        /*int sum=Integer.MIN_VALUE;
        int m=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            if(nums[0]<0||nums[1]<0)
            {
            Arrays.sort(nums);
            return nums[1];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            sum=nums[i];
           
            m=Integer.MIN_VALUE;
            for(int j=i+1;j<nums.length;j++)
            {
                sum=sum+nums[j];
                m=Math.max(m,sum);
            }
            m2=Math.max(m2,m);
        }
        return m2;
    }*//This is brute forec
    /*int sum = 0;
    int m = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        sum=0;
        for(int j=i;j<nums.length;j++)
        {
            sum=sum+nums[j];
            m=Math.max(sum,m);
        }
        m=Math.max(m,sum);
    }
    return m;*/
    
int sum=0;
int m=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++)
{
    sum=sum+nums[i];
    m=Math.max(sum,m);// for minimu use min
    if(sum<0)
    {
        sum=0;
    }
}
return m;
}
}