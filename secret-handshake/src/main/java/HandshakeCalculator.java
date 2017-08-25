import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.reverse;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String bin = Integer.toBinaryString(number);

        List<Signal> winkList = new ArrayList<>();

        if (bin.charAt(bin.length() - 1) == '1') {
            winkList.add(Signal.WINK);
        }
        if (bin.length() > 1 && bin.charAt(bin.length() - 2) == '1') {
            winkList.add(Signal.DOUBLE_BLINK);
        }
        if (bin.length() > 2 && bin.charAt(bin.length() - 3) == '1') {
            winkList.add(Signal.CLOSE_YOUR_EYES);
        }
        if (bin.length() > 3 && bin.charAt(bin.length() - 4) == '1') {
            winkList.add(Signal.JUMP);
        }

        if (bin.length() >= 5) {
            reverse(winkList);
        }
        return winkList;

    }
}