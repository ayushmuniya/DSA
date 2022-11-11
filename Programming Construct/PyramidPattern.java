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
        StringBuilder str = new StringBuilder();
        if(i==0)
        {
            System.out.println("error");
        }

        for (int j=0; j<i ; j++)
        {
            if(j!=0)
            {
                str.append(" ");
            }
            str.append("*");
        }
        return str.toString();
    }

    // TODO: Implement this method
    static String[] pyramidPrinting(int n) 
    {
        String[] pyStars = new String[n];

        for(int i=0; i<n ;i++)
        {
            pyStars[i] = getStars(i + 1);
        }
        return pyStars;
    } 
}
