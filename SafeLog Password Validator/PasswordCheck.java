import java.util.Scanner;
public class PasswordCheck {
    // Check if the password length is at least 8
    static boolean isLongEnough(String pass) {
        return pass.length() >= 8;
    }
    // Check if the password has at least one uppercase letter
    static boolean hasUppercase(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    // Check if the password has at least one number
    static boolean hasNumber(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    // Print the reasons why the password is invalid
    static void checkPassword(String pass) {
        boolean ok = true;
        if (!isLongEnough(pass)) {
            System.out.println("Too short. Use at least 8 characters.");
            ok = false;
        }
        if (!hasUppercase(pass)) {
            System.out.println("Missing an uppercase letter.");
            ok = false;
        }
        if (!hasNumber(pass)) {
            System.out.println("Missing a digit.");
            ok = false;
        }
        if (ok) {
            System.out.println("Password accepted!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = "";
        boolean valid = false;
        // Keep asking until password is valid
        while (!valid) {
            System.out.print("Enter a password: ");
            pass = input.nextLine();
            boolean long_enough = isLongEnough(pass);
            boolean has_upper = hasUppercase(pass);
            boolean has_digit = hasNumber(pass);
            if (long_enough && has_upper && has_digit) {
                valid = true;
                System.out.println("Password accepted!");
            } 
            else {
                System.out.println("Password not valid. Reasons:");
                checkPassword(pass); // Show what is missing
            }
        }
        input.close();
    }
}