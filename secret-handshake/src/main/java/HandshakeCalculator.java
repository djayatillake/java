import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        Signal[] signals = new Signal[] {Signal.WINK, Signal.DOUBLE_BLINK, Signal.CLOSE_YOUR_EYES, Signal.JUMP};
        List<Signal> signalList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if ((number & 1 << i) == 1 << i) signalList.add(signals[i]);
        }
        if ((number & 1 << 4) == 1 << 4) Collections.reverse(signalList);
        return signalList;
    }

}
