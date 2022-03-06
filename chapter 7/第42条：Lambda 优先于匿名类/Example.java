import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {
    public void anonymousClass(List<String> words) {
        Collections.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
    }

    public void lambdaExpression(List<String> words) {
        Collections.sort(words, (s1, s2) -> {
            return s1.length() - s2.length();
        });

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public void reverseList(List<String> words) {
        Collections.reverse(words);
    }

    public static void main(String[] args) {
        Example example = new Example();
        List<String> words = Arrays.asList("apple", "banana", "cat");
        example.anonymousClass(words);
        example.lambdaExpression(words);
        example.reverseList(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}