package reversestring.test;

import reversestring.base.ReverseString;
import java.util.Scanner;

public class ReverseStringTest {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        String input = reader.nextLine();

        ReverseString test = new ReverseString(input);

        String a = test.removeNonLetters();
        String b = test.reverseString();
        String c = test.ChangeCharCase();
      
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        

    }


}
