import java.util.*;
public class PasswordGenerator {
    public static void main(String[] args) {
        int len = 10;
        System.out.println(keep_password(len));
    }
    static char[] keep_password(int len){
        System.out.println("Your new password is :  ");
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String symbols = "!@#$%^&*()_=+-?.<>";
        String values = Capital_chars + Small_chars + num + symbols;
        Random ran_method = new Random();

        char[] password = new char[len];
        for (int i = 0;i<len;i++){
            password[i] = values.charAt(ran_method.nextInt(values.length()));
        }
        return password;
    }

}
