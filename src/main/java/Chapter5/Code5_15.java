package Chapter5;

/**
 * Created by Wilbur Hsu on 2017/12/21.
 * PrimeNumber
 */
public class Code5_15 {
    public static void main(String[] args) {
        final int NUM_OF_PRIMES = 50;
        final int NUM_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUM_OF_PRIMES){
            boolean isPrime = true;

            for(int divisor = 2;divisor <= number / 2; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;
                if(count % NUM_OF_PRIMES_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");

            }
            number++;
        }
    }
}
