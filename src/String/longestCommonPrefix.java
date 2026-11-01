package String;

import java.util.Scanner;
class Solution {

    public String longestCommonPrefix(String[] str) {

        String first = str[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < str.length; j++) {

                if (i >= str[j].length() || str[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] str = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        Solution obj = new Solution();

        String result = obj.longestCommonPrefix(str);

        System.out.println("Longest Common Prefix: " + result);

        sc.close();
    }
}