import java.util.*;

class PyramidPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }

    public static String getStars(int i)
    {
        //creating new variable os type stringbuilder so that we can later append on the same string, since string are..
        //..immutable in java
        StringBuilder starBuilder = new StringBuilder();

        //edge case
        if(i==0)
        {
            System.out.println("error");
        }

        for (int j=0; j<i ; j++)
        {
            if(j!=0)
            {
                starBuilder.append(" ");
            }
            starBuilder.append("*");
        }
        //convert to string as expected in the return type of the function
        return starBuilder.toString();
    }

    // TODO: Implement this method
    static String[] pyramidPrinting(int n) 
    {
        //creating a string array with n elements (which will be number of stars in this case)
        String[] pyramidStars = new String[n];

        for(int i=0; i<n ;i++)
        {
            //eg: i=1
            //output: *
            //eg : i=2
            //output: * *

            pyramidStars[i] = getStars(i + 1);
        }
        return pyramidStars;
    } 
}
