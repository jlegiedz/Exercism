class LuhnValidator {

    boolean isValid(String candidate) {

        if(candidate == null ){
            return false;
        }

        String candidate2 = candidate.replaceAll("\\s+", "");

        if (candidate2.length() <= 1) {
            return false;
        }

        if (!candidate2.matches("\\d+")) {
            return false;
        }
        // reverseing trimmed array
        char[] trimmed = candidate2.toCharArray();
        for (int i = 0; i < Math.floor(trimmed.length / 2); i++) {
            char j=trimmed[trimmed.length-1-i];
            trimmed[trimmed.length-1-i] = trimmed[i];
            trimmed[i]=j;
        }

        int sum = 0;
        for (int i = 0; i < trimmed.length ; i++) {
            int num = Character.getNumericValue(trimmed[i]);
            if((i + 1) % 2 == 0){
                num = num *2;
            }
            if(num > 9){
                num = num -9;
            }
            sum = sum + num;
        }

        return sum % 10 ==0;
    }

}
