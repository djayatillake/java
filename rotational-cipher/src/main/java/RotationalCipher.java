import java.util.Arrays;
import java.util.stream.Collectors;

class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    char RotateChar(char shiftchar) {
        if (Character.isAlphabetic(shiftchar)) {
            if (Character.isUpperCase(shiftchar)) {
                return (char) ((int) 'A' + ((int) shiftchar - (int) 'A' + shiftKey) % 26);
            } else {
                return (char) ((int) 'a' + ((int) shiftchar - (int) 'a' + shiftKey) % 26);
            }
        }
        return shiftchar;
    }

    String rotate(String data) {
        return data.chars().mapToObj(i -> this.RotateChar((char) i)).map(String::valueOf).collect(Collectors.joining());
    }
}