import java.util.*;

class BigIntegerAddition {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    // TODO: Implement this method
    static String bigIntegerAddition(String str1, String str2) 
    {
        int carry = 0;
        StringBuilder result = new StringBuilder();

        int i=str1.length() -1;
        int j=str2.length() -1;
        while(i>=0 || j>=0)
        {
            int n1 = (i<0)?0:str1.charAt(i)-'0';
            int n2 = (j<0)?0:str2.charAt(j)-'0';

            int sum=n1+n2+carry;
            result.append(sum%10);
            carry=sum/10;

            i--;
            j--;
        }
        if(carry==1){
            result.append(carry);
        }
        return result.reverse().toString();
    }
    
}
