import java.util.*;

class FindQuadrant {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        int result = findQuadrant(x, y);
        System.out.println(result);

    }

    // TODO: Implement this method
    static int findQuadrant(float x, float y) 
    {
        if(x<0 && y<0)
        {
            return 3;
        }
        else if(x<0 && y>0)
        {
            return 2;
        }
        else if(x>0 && y<0)
        {
            return 4;
        }
        else
        return 1;
    }

}
