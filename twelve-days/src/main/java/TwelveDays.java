class TwelveDays {

    String one = "On the first day of Christmas my true love gave to me," +
            " a Partridge in a Pear Tree.\n";

    String two = "On the second day of Christmas my true love gave to me," +
            " two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String three = "On the third day of Christmas my true love gave to me, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String four = "On the fourth day of Christmas my true love gave to me," +
            " four Calling Birds, three French Hens, two Turtle Doves," +
            " and a Partridge in a Pear Tree.\n";

    String five = "On the fifth day of Christmas my true love gave to me," +
            " five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n";

    String six = "On the sixth day of Christmas my true love gave to me," +
            " six Geese-a-Laying, five Gold Rings, four Calling Birds," +
            " three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String seven = "On the seventh day of Christmas my true love gave to me, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings," +
            " four Calling Birds, three French Hens, two Turtle Doves," +
            " and a Partridge in a Pear Tree.\n";

    String eight = "On the eighth day of Christmas my true love gave to me," +
            " eight Maids-a-Milking, seven Swans-a-Swimming, " +
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String nine = "On the ninth day of Christmas my true love gave to me," +
            " nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
            "two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String ten = "On the tenth day of Christmas my true love gave to me, " +
            "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String eleven = "On the eleventh day of Christmas my true love gave to me, " +
            "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing," +
            " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying," +
            " five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves," +
            " and a Partridge in a Pear Tree.\n";

    String twelve = "On the twelfth day of Christmas my true love gave to me, " +
            "twelve Drummers Drumming," +
            " eleven Pipers Piping," +
            " ten Lords-a-Leaping, nine Ladies Dancing, " +
            "eight Maids-a-Milking, seven Swans-a-Swimming," +
            " six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";

    String verse(int verseNumber) {
        String song = null;
        switch (verseNumber) {
            case 1:
                song = one;
                break;
            case 2:
                song = two;
                break;
            case 3:
                song = three;
                break;
            case 4:
                song = four;
                break;
            case 5:
                song = five;
                break;
            case 6:
                song = six;
                break;
            case 7:
                song = seven;
                break;
            case 8:
                song = eight;
                break;
            case 9:
                song = nine;
                break;
            case 10:
                song = ten;
                break;
            case 11:
                song = eleven;
                break;
            case 12:
                song = twelve;
                break;
        }
        return song;
    }

    String verses(int startVerse, int endVerse) {
        TwelveDays twelveDays = new TwelveDays();
        StringBuilder song = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            song = song.append(twelveDays.verse(i));
            if (i != endVerse) {
                song.append("\n");
            }
        }
        return song.toString();
    }

    String sing() {
        TwelveDays twelveDays = new TwelveDays();
        StringBuilder song = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            song = song.append(twelveDays.verse(i));
            if (i != 12) {
                song.append("\n");
            }
        }
        return song.toString();
    }
}
