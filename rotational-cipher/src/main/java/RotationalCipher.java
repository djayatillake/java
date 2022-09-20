class RotationalCipher {

    private int shiftKey;
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        char[] carray = data.toCharArray();
        for (int i = 0; i < carray.length; i++) {
            if (Character.isAlphabetic(carray[i])) {
                if (Character.isUpperCase(carray[i])) {
                    carray[i] = (char)((int)'A' + ((int)carray[i] - (int)'A' + shiftKey) % 26);
                } else {
                    carray[i] = (char)((int)'a' + ((int)carray[i] - (int)'a' + shiftKey) % 26);
                }    
            }
        }
        return String.valueOf(carray);
    }

}
