import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        s = s.trim();

        if(s.length() > 0) {
            char firstLetter = s.charAt(0);
            if(Character.isLowerCase(firstLetter)) {
                s = s.substring(0).toUpperCase();
            }

        System.out.println(s);
        sc.close();
    }
}
}
