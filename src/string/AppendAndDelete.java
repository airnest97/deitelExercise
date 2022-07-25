package string;


public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        int count = 0;
        boolean condition = (count < s.length()) && (count < t.length());
        while (s.charAt(count) == t.charAt(count) && condition) {
            count++;
        }
        int degreeOfChange = s.length()-count;
        if (degreeOfChange <= k) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
