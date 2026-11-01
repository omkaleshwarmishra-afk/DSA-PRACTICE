package String;

import java.util.Scanner;

class Solution {

    public String largeOddNum(String s) {

        for (int i = s.length() - 1; i >= 0; i--) {

            if ((s.charAt(i) - '0') % 2 != 0) {

                String ans = s.substring(0, i + 1);

                return ans.replaceFirst("^0+", "");
            }
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.nextLine();

        Solution obj = new Solution();

        String result = obj.largeOddNum(s);

        System.out.println("Largest odd number: " + result);

        sc.close();
    }
}