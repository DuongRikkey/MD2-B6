package String;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";


        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập email");
        String check = sc.nextLine();
        boolean isValid = Pattern.matches(regex, check);
        if (isValid) {
            System.out.println("Email chuẩn vl");
        }
        else
          System.out.println("Sai cú pháp rồi hehe");

    }
}
