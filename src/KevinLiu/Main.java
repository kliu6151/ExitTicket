package KevinLiu;

public class Main {


    public static boolean haveThree(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length - 1; i++)
        {
            if(nums[i] == 3)
            {
                if(nums[i+1] == 3)
                    return false;
            }
            count++;
        }

        if(count >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3}));
        System.out.println(haveThree(new int[]{3, 1, 3, 3}));
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4}));

    }
}
