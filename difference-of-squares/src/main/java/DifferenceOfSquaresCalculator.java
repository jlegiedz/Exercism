import java.util.ArrayList;
import java.util.Random;

/**
 * Created by asia on 29/07/17.
 */
public class DifferenceOfSquaresCalculator {


    public static int computeSquareOfSumTo(int numbersLimit){
        int sum =0;
        for (int i = 0; i <= numbersLimit  ; i++) {
            sum = sum + i;
        }
        return sum * sum;
    }
    public static int computeSumOfSquaresTo(int numbersLimit){
        int sum =0;
        for (int i = 0; i <= numbersLimit ; i++) {
            sum = sum + (i * i);
        }
        return sum;
    }

    public static int computeDifferenceOfSquares(int numbersLimit){
       return computeSquareOfSumTo(numbersLimit) - computeSumOfSquaresTo(numbersLimit);
    }


}
