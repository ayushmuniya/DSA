import java.util.*;

class Capitalise 
{
    // NOTE: Please do not modify this function
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitalise(String str)
    {
        //converting into character array
        char ch[] = str.toCharArray();
        
        for(int i=0 ; i<ch.length ; i++)
        {
            // checks if the current character is the first character of a any word
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') 
            {
                // If the first character we found is in lower-case
                if (ch[i] >= 'a' && ch[i] <= 'z') 
                {
                    // Convert in into Upper-case using below formula
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
            // If apart from first character, Any other character is in the Upper-case
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
 
                // Convert that into Lower-Case
                ch[i] = (char)(ch[i] + 'a' - 'A');  
        }     
        String captStr = new String(ch);
        return captStr;   
    }
}
