import java.util.Random;
public class otpGenerator{
    private static final int OTP_LENGTH =4;

    public static String generateOTP() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<OTP_LENGTH;i++){
            int digit = r.nextInt(0,10);
            sb.append(digit);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = generateOTP();
        System.out.println();
        System.out.println("You'r Otp is :"+ s);
    }
}