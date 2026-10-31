package String;

public class reverseString {

    public static void main(String[] args) {

        String str = "Raj Mishra";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}