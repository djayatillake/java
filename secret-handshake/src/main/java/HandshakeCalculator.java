import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        int trim = number % 32;
        boolean reverse = trim / 16 == 1;
        trim %= 16;
        Signal[] signals = new Signal[] {Signal.JUMP, Signal.CLOSE_YOUR_EYES, Signal.DOUBLE_BLINK, Signal.WINK};
        int denom = 8;
        List<Signal> signalList = new ArrayList<>();
        for (int i = 0; i < signals.length; i++) {
            if (trim / denom == 1) {
                signalList.add(signals[i]);
            }
            trim %= denom;
            denom /= 2;
        }
        if (reverse) {
            return signalList;
        } 
        Collections.reverse(signalList);
        return signalList;
    }

}
