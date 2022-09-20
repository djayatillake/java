class RotationalCipher {

    private int shiftKey;
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    char RotateChar(char shiftchar, int shiftkey) {
        if (Character.isAlphabetic(shiftchar)) {
            if (Character.isUpperCase(shiftchar)) {
                return (char)((int)'A' + ((int)shiftchar - (int)'A' + shiftKey) % 26);
            } else {
                return (char)((int)'a' + ((int)shiftchar - (int)'a' + shiftKey) % 26);
            }    
        }
        return shiftchar;
    }

    String rotate(String data) {
        char[] carray = data.toCharArray();
        for (int i = 0; i < carray.length; i++) {
            carray[i] = RotateChar(carray[i], this.shiftKey);
        }
        return String.valueOf(carray);
    }

}
