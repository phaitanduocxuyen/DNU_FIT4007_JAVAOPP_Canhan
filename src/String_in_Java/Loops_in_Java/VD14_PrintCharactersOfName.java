package src.String_in_Java.Loops_in_Java;
import java.util.Scanner;

public class VD14_PrintCharactersOfName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
