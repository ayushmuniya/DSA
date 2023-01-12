import java.util.*;

// Implement your solution here
class LongestSubstringWithAtMostKDistinctCharacter 
{

    public int lengthOfLongestSubstringKDistinct(String s, int k) 
    {
        if(k==0)
        return 0;

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        int maxLength = 0;
        int leftPointer = 0; 
        int rightPointer = 0;
        int count = 0;

        while(rightPointer<s.length() && leftPointer <= rightPointer)
        {
            if(map.containsKey(s.charAt(rightPointer)) && map.get(s.charAt(rightPointer)) >= leftPointer)
            {
                int length = rightPointer - leftPointer + 1;
                if(length>maxLength)
                {
                    maxLength = length;
                }
            }
            else
            {
                count ++;
                if(count<=k)
                {
                    int length = rightPointer - leftPointer + 1;
                    if(length>maxLength)
                    {
                        maxLength = length;
                    }

                }
                else
                {
                    while(map.get(s.charAt(leftPointer)) != leftPointer)
                    {
                        leftPointer++;
                    }
                    leftPointer++;

                    int length = rightPointer - leftPointer + 1;
                    if(length>maxLength)
                    {
                        maxLength = length;
                    }
                }

                map.put(s.charAt(rightPointer),rightPointer);

            }

            map.put(s.charAt(rightPointer), rightPointer);
            rightPointer++;
        }

        return maxLength;
    }
    

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
	    scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        int result = new LongestSubstringWithAtMostKDistinctCharacter().lengthOfLongestSubstringKDistinct(s,k);
        System.out.println(result);
    }
}
