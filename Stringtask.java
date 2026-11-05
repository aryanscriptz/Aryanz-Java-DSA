import java.util.*;

public class Stringtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";
        String v = "aoyeuiAOYEUI";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (v.indexOf(ch) == -1) {
                ans = ans + "." + Character.toLowerCase(ch);
            }
        }

        System.out.println(ans);
    }
}