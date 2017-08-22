import java.util.ArrayList;
import java.util.List;

class Sieve {

    List<Integer> numbers = new ArrayList<>();

    Sieve(int maxPrime) {
        for (int i = 2; i <= maxPrime; i++) {
            numbers.add(i);

        }
    }

    //2,3,4,5,6,7,8,9,10
    List<Integer> noPrimes = new ArrayList<>();

    List<Integer> getPrimes() {

        for (int i = 0; i < numbers.size(); i++) {
            int j = i + 1;
            noPrimes.clear();

            while (j < numbers.size()) {
                if (numbers.get(j) % numbers.get(i) == 0) {
                    noPrimes.add(numbers.get(j));
                }
                j++;
            }

            System.out.println(noPrimes);
            for (int k = 0; k < noPrimes.size(); k++) {
                numbers.remove(noPrimes.get(k));    //i =0, => 2,3,5,7,9
            }
            System.out.println(numbers);

        }
        return numbers;
    }

}
