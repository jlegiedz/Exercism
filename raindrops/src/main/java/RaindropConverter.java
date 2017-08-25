class RaindropConverter {

    StringBuilder builder = new StringBuilder();

    String convert(int number) {

        if (number % 3 == 0) {
            builder.append("Pling");
        }
        if (number % 5 == 0) {
            builder.append("Plang");
        }
        if (number % 7 == 0) {
            builder.append("Plong");
        }
        else if ( builder.length() == 0) {
            return String.valueOf(number);
        }

        return builder.toString();

    }

}
