package Java;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }

    static public String isPrime(int a){
        String status = "";
        if (a < 0 || a == 1){
            status = "not Prime";
        } else if (a == 2 && a % 2 == 0) {
            status = "Prime";
        }
        return status;
    }
}
