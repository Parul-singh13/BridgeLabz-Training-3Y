import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static String generateOTP() {
        int otp = (int)(Math.random() * 900000) + 100000; // 6-digit OTP
        return String.valueOf(otp);
    }

    public static boolean areOTPsUnique(String[] otps) {
        Set<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            if (!otpSet.add(otp)) {
                return false; // duplicate found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
