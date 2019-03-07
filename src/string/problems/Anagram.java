package string.problems;

import java.util.Arrays;


public class Anagram {

    static boolean areAnagram(char[] x, char[] y)
    {
        int n1 = x.length;
        int n2 = y.length;

        if (n1 != n2)
            return false;

        Arrays.sort(x);
        Arrays.sort(y);

        for (int i = 0; i < n1; i++)
            if (x[i] != y[i])
                return false;

        return true;
    }

    public static void main(String[] args) {


        char x[] = { 't', 'e', 's', 't' };
        char y[] = { 't', 't', 'e', 'w' };

        if (areAnagram(x, y))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

}
}
