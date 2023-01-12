import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) 
    {
        //lambda expression to sort the array
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        //stack creation
        Stack<int[]> st = new Stack<>();

        st.push(intervals[0]);
        for(int i=1; i<intervals.length; i++)
        {
            if(st.peek()[1] >= intervals[i][0])
            {
                st.peek()[1] = Math.max(st.peek()[1], intervals[i][1]);
            }
            else
            {
                st.push(intervals[i]);
            }
        }

        int [][] ans = new int[st.size()][2];
        for(int i = ans.length-1; i>=0 ; i--)
        {
            ans[i][0] = st.peek()[0];
            ans[i][1] = st.peek()[1];
            st.pop();
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}
