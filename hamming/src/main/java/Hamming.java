public class Hamming {

    int hamming_count = 0;

    Hamming(String leftStrand, String rightStrand) {
       char[] leftCharStrand = leftStrand.toCharArray();
       char[] rightCharStrand = rightStrand.toCharArray();

       if(leftCharStrand.length != rightCharStrand.length){
           throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
       }
       else {
           int i = 0;
           while (i < leftCharStrand.length) {
               if (leftCharStrand[i] != rightCharStrand[i]) {
                   hamming_count++;
               }
               i++;
           }
       }

    }

    int getHammingDistance() {
       return hamming_count;
    }

}