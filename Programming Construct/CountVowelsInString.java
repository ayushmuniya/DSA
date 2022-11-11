import java.util.*;

class CountVowels 
{ 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();

        int vowels = countVowels(str);
        
        System.out.println(vowels); 
        // System.out.println(isVowel('a'));
        // System.out.println(isVowel('A'));
    }

    private static Boolean isVowel(char character) 
    { 
        character = Character.toLowerCase(character);
        if(character == 'a' || character == 'e' || character == 'i'|| character == 'o' || character =='u') 
        {
            return true; 
        } 
        return false;
    }    

    static int countVowels(String str) 
    {
        int vowelCounter = 0;
            // Loop through the string given 
        for (char input : str.toCharArray()) 
        {
            if(isVowel(input))
            {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }

}
