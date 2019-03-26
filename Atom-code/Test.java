
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        System.out.println(method(scanner.next()));
    }

    private static String method(String str) {
        char[] chars = str.toCharArray();
        String string = "";
        for (int i = chars.length-1; i > -1 ; i--) {
            string += chars[i];
        }
        return string;
    }
}
