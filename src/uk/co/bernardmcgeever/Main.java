package uk.co.bernardmcgeever;

public class Main {

    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        for (int number : numbers){
            if (pd.isPrime(number)){
                System.out.println(number);
            }
        }
    }
}
