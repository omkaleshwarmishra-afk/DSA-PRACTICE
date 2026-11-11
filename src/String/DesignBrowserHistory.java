
package String;

import java.util.Stack;

public class DesignBrowserHistory {

    Stack<String> currHistory;
    Stack<String> forwardHistory;

    public DesignBrowserHistory(String homepage) {
        currHistory = new Stack<>();
        forwardHistory = new Stack<>();

        currHistory.push(homepage);
    }

    public void visit(String url) {
        currHistory.push(url);
        forwardHistory.clear();
    }

    public String back(int steps) {

        while (steps-- > 0) {
            if (currHistory.size() > 1) {
                String backTab = currHistory.pop();
                forwardHistory.push(backTab);
            } else {
                break;
            }
        }

        return currHistory.peek();
    }

    public String forward(int steps) {

        while (steps-- > 0) {
            if (!forwardHistory.isEmpty()) {
                String forwardTab = forwardHistory.pop();
                currHistory.push(forwardTab);
            } else {
                break;
            }
        }

        return currHistory.peek();
    }

    public static void main(String[] args) {

        DesignBrowserHistory browser =
                new DesignBrowserHistory("leetcode.com");

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        System.out.println(browser.back(1));
        System.out.println(browser.back(1));

        System.out.println(browser.forward(1));

        browser.visit("linkedin.com");

        System.out.println(browser.forward(2));
        System.out.println(browser.back(2));
        System.out.println(browser.back(7));
    }
}
