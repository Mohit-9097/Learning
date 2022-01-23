// using random() method, we can genrate random password otp etc.

import java.util.*;
public class OtpGenerator {
    static char[] OTP(int len){
        System.out.println("Generating OTP using random(): ");
        System.out.print("Your OTP is : ");
        String nums = "0123456789";
        Random rnd_method = new Random();
        char[] otp = new  char[len];
        for(int i = 0; i < len; i++){
            otp[i] = nums.charAt(rnd_method.nextInt(nums.length()));
        }
        return otp;
    }

    public static void main(String[] args) {
        int length = 4;
        System.out.println(OTP(length));
    }

}
