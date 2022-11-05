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
         int revNum = 0;

         while(num != 0)
         {
             int digit = num % 10; //reminder - to extract the last digit
             num = num /10; //quotient - to get rid of last digit now.
             revNum = revNum*10 + digit; // 43 = 40*10 + 3
         }
         return revNum;
     }
}
