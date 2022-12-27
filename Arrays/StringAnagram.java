import java.io.*;
import java.util.*;

public class ValidAnagram {
    public boolean validAnagram(String s, String t) 
    {
         //checking length of both the given string
        int lengthOfString_s = s.length();
        int lengthOfString_t = t.length();

        //check if the lengths of the given strings are not equal, they can never be anagram to each other
        if (lengthOfString_s != lengthOfString_t)
        {
            return false;
        }

        //creating an array of size 26 (as there are 26 english alphabet)
        int[] freq = new int [26];

        //intialize value of every element of the array to 0
        for(int i=0;  i<26; i++) 
        {
            freq[i] = 0;
        }

        // Iterate through the given string s
        // increment the value at index "freq [ s[i] - 'a']" from 0 to 1 in the corresponding freq array
        // then iterate through the given string t
        // and decrement the value at index "freq [ t[i] - 'a']" from 0 to -1 in the corresponding freq array

        for(int i=0; i<s.length(); i++)
        {
            freq[s.charAt(i) - 'a'] ++ ;
            freq[t.charAt(i) - 'a'] -- ;      
        }

        //iterate through the freq array and check if the value at all the index's are 0
        for(int i=0; i<26; i++)
        {
            if(freq[i] != 0)
            {
                return false;
            }
        }
        return true;

    }
