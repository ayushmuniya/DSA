import java.util.*;


class IncrementNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        int incArr[] = incrementNumber(n, arr);

        for(int i=0;i<incArr.length;i++) {
            System.out.print(incArr[i]);
        }
        
    }

    static int[] incrementNumber(int n, int arr[])
    {
        for(int i = arr.length- 1; i>=0; i--)
        {
            if(arr[i] <9)
            {
                arr[i]= arr[i] + 1;
                return arr;
            }
            else 
                arr[i]=0;
        }
        int result[] = new int[n+1];
        result[0] = 1;
        return result;
    }
}

