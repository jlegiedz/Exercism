class SumOfMultiples {

    int sum;

    SumOfMultiples(int number, int[] set) {
        sum = 0;
        for (int i = 1; i < number; i++) {
            if (checkIfMultiples(i, set)) {
                sum = sum + i;
            }
        }
    }

    boolean checkIfMultiples(int nat, int[] set) {
        for (int i = 0; i < set.length; i++) {
            if (nat % set[i] == 0) {
                return true;
            }
        }
        return false;
    }

    int getSum() {
        return sum;
    }

}
