public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = 0;

        /*for (int i = 2; i < 25; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
            }*/
        boolean isPrime = true;

        if (number < 1 || number == 1) {
            System.out.println(number + " is a invalid number.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}