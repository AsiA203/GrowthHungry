package Java;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    static public boolean isPrime(int a) {
        int kFirst = 0;
        int kSecond = 0;

        if (a == 2 || a == 3) {
            return true;
        } else if (a <= 0 || a % 2 == 0 || a % 3 == 0) {
            return false;
        }

        if (a > 3) {
            kFirst = 6 * a - 1;
            kSecond = 6 * a + 1;
        }
        return a % kFirst != 0 || a % kSecond != 0;
    }
}
