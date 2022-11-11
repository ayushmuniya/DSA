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
        char ch[] = str.toCharArray();
        for(int i=0 ; i<str.length() ; i++)
            {
                if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') 
                {
 
                // If it is in lower-case
                    if (ch[i] >= 'a' && ch[i] <= 'z') 
                    {
    
                        // Convert into Upper-case
                        ch[i] = (char)(ch[i] - 'a' + 'A');
                    }
                }
            }     
        String captStr = new String(ch);
        return captStr;   
    }
}
