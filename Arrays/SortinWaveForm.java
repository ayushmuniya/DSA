import java.util.*;


class WiggleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    static List<Integer> wiggleSort(int n, List<Integer>nums)
    {
        for (int i = 0; i < n-1; i++) {
        if (i % 2 == 0) {  // even indices
            if (nums.get(i) > nums.get(i+1)) {
                int temp = nums.get(i);
                nums.set(i, nums.get(i+1));
                nums.set(i+1, temp);
            }
        } else {  // odd indices
            if (nums.get(i) < nums.get(i+1)) {
                int temp = nums.get(i);
                nums.set(i, nums.get(i+1));
                nums.set(i+1, temp);
            }
        }
    }
    return nums;
    }
}
