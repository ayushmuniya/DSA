import java.util.*;

class ReverseNum {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }

    // TODO: Implement this method
     static int reverseNum(int num) 
     {
         //initializing our reverse number to 0
         int revNum = 0;

         //do this iteration until the number becomes 0
         while(num != 0)
         {
             int digit = num % 10;          // % is for reminder - to extract the last digit
             num = num / 10;                 //this give quotient - to get rid of last digit now.
             revNum = revNum*10 + digit;    // start forming our reverse number
         }
         return revNum;
     }
}


/*
Suppose, we want to reverse the number 1234.

In this example, we have taken three variables named number (the number to be reversed), remainder (stores the remainder), reverse (stores the reverse number) initialized 0.

Iteration 1:

number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 0 + 4 = 4
number = 1234 / 10 = 123
Now the value of the number and reverse variable is 123 and 4, respectively.

Iteration 2:

number = 123
remainder = 123 % 10 = 3
reverse = 4 * 10 + 3 = 40 + 3 = 43
number = 123 / 10 = 12
Now the value of the number and reverse variable is 12 and 43, respectively.

Iteration 3:

number = 12
remainder = 12 % 10 = 2
reverse = 43 * 10 + 2 = 430 + 2 = 432
number = 12 / 10 = 1
Now the value of the number and reverse variable is 1 and 432, respectively.

Iteration 4:

number = 1
remainder = 1 % 10 = 1
reverse = 432 * 10 + 1 = 4320 + 1 = 4321
number = 1 / 10 = 0
Now the variable number become 0. Hence, we get the reverse number 4321.
*/
