package Stack;

class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            }

            else {
                count--;

                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}


//
//FindBorderBarSize


//
//
//420. Remove Outermost Parentheses
//A valid parentheses string is defined by the following rules:
//
//It is the empty string "".
//If A is a valid parentheses string, then so is "(" + A + ")".
//If A and B are valid parentheses strings, then A + B is also valid.
//A primitive valid parentheses string is a non-empty valid string that cannot be split into two or more non-empty valid parentheses strings.
//
//Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
//
//Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.