import java.util.*;
import java.util.stream.Stream;

public class LargestSeriesProductCalculator {
    String string;

    public LargestSeriesProductCalculator(String string) {
        this.string = string;
        if (string == null) {
            throw new IllegalArgumentException("String to search must be non-null.");
        }
        if (string.matches(".*[^0-9].*")) {
            throw new IllegalArgumentException("String to search may only contains digits.");
        }
    }


    public long calculateLargestProductForSeriesLength(long s) {

        if (s == 0) return 1;
        if (s > string.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (s < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        int[] numbers = new int[string.length()];
        // add numbers to numbers array from the string
        for (int i = 0; i < string.length(); i++) {
            numbers[i] = Character.getNumericValue(string.charAt(i));
        }
        long product = 0;
        long largestProduct = 0;
        for (int j = 0; j < numbers.length - s + 1; j++) {
            product = 1;
            for (int k = 0; k < s; k++) {
                product = product * numbers[j + k];
            }
            if (product > largestProduct) {
                largestProduct = product;
            }

        }
        return largestProduct;
    }


}




