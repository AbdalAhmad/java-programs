import java.util.Scanner;
import java.util.Arrays;

public class anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        // Convert Strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // First check - if the lengths are the same
        if (a.length() == b.length()) {
            char[] aN = a.toCharArray();
            char[] bN = b.toCharArray();
            Arrays.sort(aN);
            Arrays.sort(bN);
            boolean result = Arrays.equals(aN, bN);
            if (result) {
                System.out.println(a + " and " + b + " are anagrams of each other.");
            } else {
                System.out.println(a + " and " + b + " are not anagrams of each other.");
            }
        } else {
            System.out.println(a + " and " + b + " are not anagrams of each other.");
        }

        scanner.close();
    }
}
