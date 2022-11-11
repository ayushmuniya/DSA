import java.util.*;

class CheckPrime {
    // NOTE: Please do not modify this function
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < t; i++) 
        {
            int n = sc.nextInt();
            nums.add(n);
        }

        ArrayList<Boolean> ans = checkPrime(t, nums);

        for (boolean res : ans) 
        {
            System.out.println(res);
        }

    }

    // TODO: Implement this method
    static ArrayList<Boolean> checkPrime(int t, ArrayList<Integer> nums) 
    {
        ArrayList<Boolean> result = new ArrayList<>();

        for(int n: nums)
        {
            int count =0;

            for (int i = 2; i*i <= n; i++) 
            {
                if (n % i == 0)
                count++;
            }
            
            if(count >0 || n <2)
            {
                result.add(false);
            }
            else
            result.add(true);
        }
        return result;
    }
}
