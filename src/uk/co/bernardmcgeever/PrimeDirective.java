package uk.co.bernardmcgeever;

public class PrimeDirective
{

    public boolean isPrime(int number)
    {
        if (number < 2)
        {
            return false;
        }
        else if (number == 2)
        {
            return true;
        }
        else
        {
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }

}
