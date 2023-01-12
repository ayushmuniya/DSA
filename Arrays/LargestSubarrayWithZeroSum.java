import java.util.*;

class LargestSubarraySumZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = largestSubarraySumZero(n, arr);

        for (int j : res)
            System.out.print(j + " ");
                }

    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) 
    {
        int maxLength = 0;
        int sum = 0;
        int startingPoint = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        map.put(0,-1);

        for(int i=0; i<n; i++)
        {
            sum = sum + arr[i];

            if (map.containsKey(sum))
            {
                int previousIndex = map.get(sum);
                int length = i - previousIndex;

                if(length>maxLength)
                {
                    maxLength = length;
                    startingPoint = previousIndex + 1;
                }

            }
            else
            {
                map.put(sum,i);
            }
        }   

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=startingPoint ; i<startingPoint+maxLength ; i++)
        {
            answer.add(arr[i]);
        }

        if(maxLength ==0)
        {
            answer.add(-1);
        }
        
        return answer;
    }
}
