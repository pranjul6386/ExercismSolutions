import java.util.*;
import java.io.*;
import java.lang.*;
class PrimeFactorsCalculator
{
    public List<Long> calculatePrimeFactorsOf(long number)
    {
        List<Long> Result = new ArrayList<Long>();
		long i = 2;
        while(number != 1)
        {
            if(number % i == 0 )
            {
                Result.add(i);
                number /= i;
            }
			else
			{
				i++;
			}
        }
        return Result;
    }
}
