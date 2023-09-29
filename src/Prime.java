import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        //TO-DO
        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();

        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        long primeNum = nthPrime(n);

        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.printf("%d %d %d%n", n, primeNum, executionTime);
    }

    public static long nthPrime(long n) {
        //TO-DO
        int numbers = 2;
        int isPrime = 2;
        int numOfPrimes = 0;
        long nthPrime = 0;

        while (numOfPrimes < n) {
            if (numbers < isPrime) {
                if (isPrime % numbers == 0) {
                    numbers = 2;
                    isPrime++;
                } else {
                    numbers++;
                }
            } else {
                nthPrime = isPrime;
                isPrime++;
                numbers = 2;
                numOfPrimes++;
            }
        }
        return nthPrime;
    }
}