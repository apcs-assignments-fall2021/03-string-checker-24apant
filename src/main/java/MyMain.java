import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int total_count = 0;
        for (int i=0; i< str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c') {
                total_count += 1;
            }
        }
        // REPLACE WITH YOUR CODE
        return total_count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        // REPLACE WITH YOUR CODE
        if (str.contains("The") || str.contains("the")){
            return true;
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        // REPLACE WITH YOUR CODEE
        for (int i=0; i<str.length();i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a string to test: ");
        String userStr = scan.next();
        System.out.println("There are " + countABC(userStr) + " a's, b's and c's in the string.");
        if (containsThe(userStr)){
            System.out.println(userStr + " contains either The or the.");
        }
        else{
            System.out.println(userStr + " does not contain The or the. ");
        }
        if (isPalindrome(userStr)){
            System.out.println(userStr + " is a palindrome.");
        }
        else{
            System.out.println(userStr + " is not a palindrome.");
        }
    }
}
