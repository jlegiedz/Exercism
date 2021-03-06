public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        char[] dna = dnaStrand.toCharArray();
        for (int i = 0; i < dna.length; i++) {
            switch (dna[i]) {
                case 'G':
                    dna[i] = 'C';
                    break;
                case 'C':
                    dna[i] = 'G';
                    break;
                case 'T':
                    dna[i] = 'A';
                    break;
                case 'A':
                    dna[i] = 'U';
                    break;
            }
        }
        String rnaStrand = new String(dna);
        return rnaStrand;

    }
}

//G -> C
//C -> G
//      T -> A
//   A -> U