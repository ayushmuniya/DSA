import java.util.*;

public class MeetingRooms {

    public int findNumRooms(int[][] intervals) 
    {  
        int n = intervals.length;  
        //creating arrays of starting and end time  
        int[] start = new int[n];  
        int[] end = new int[n];  
        //loop iterate over the start and end time intervals  
        for (int i = 0; i < n; i++)   
        {  
            start[i] = intervals[i][0];  
            end[i] = intervals[i][1];  
        }  
        //sorting starting time array  
        Arrays.sort(start);  
        //sorting end time array  
        Arrays.sort(end);  
        int i = 1, j = 0, curr = 1;  
        int answer = 1;  
        //executes when any both conditions return true  
        while (i < start.length && j < end.length)   
        {  
        //the condition denotes that the j-th meeting is going on  
        if (start[i] < end[j])   
        {  
        //incrementing the meeting room  
        curr++;  
        //incrementing I because i-th meeting has started   
        i++;  
        }   
        else   
        {  
        //decrements the meeting room by 1 because meeting room is free  
        curr--;  
        //increments the j-th meeting  
        j++;  
        }  
        //find the max of answer and curr  
        answer = Integer.max(answer, curr);  
        }  
        //returns the mnimum number of meeting room required  
        return answer;  
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

        int result = new MeetingRooms().findNumRooms(nums);

        System.out.printf("%d", result);
    }

}
