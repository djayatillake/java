import java.util.stream.IntStream;

class Scrabble {
    private String word;
    private char[] wordArray;
    private boolean doubleWord;
    private boolean tripleWord;
    private boolean[] doubleArray;
    private boolean[] tripleArray;

    Scrabble(String word) {
        this(word, false, false, new boolean[word.length()], new boolean[word.length()]);
    }
    
    Scrabble(String word, boolean tripleWord, boolean doubleWord, boolean[] tripleArray, boolean[] doubleArray) {
        this.word = word;
        this.wordArray = word.toUpperCase().toCharArray();
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
        this.doubleArray = doubleArray;
        this.tripleArray = tripleArray;
    }

    private int letterScore(char letter) {
        switch (letter) {
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T':
                return 1;
            case 'D', 'G':
                return 2;
            case 'B', 'C', 'M', 'P':
                return 3;
            case 'F', 'H', 'V', 'W', 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J', 'X':
                return 8;
            case 'Q', 'Z':
                return 10;
            default:
                return 0;
        }
    }

    private int lettersScore(char[] chars) {
        return chars == null ? 0 : (int) IntStream.range(0, chars.length)
                .map(i -> letterScore(chars[i]) * (doubleArray[i] ? 2 : 1) * (tripleArray[i] ? 3 : 1))
                .sum();
    }

    int getScore() {
        return lettersScore(wordArray) * (tripleWord ? 3 : 1) * (doubleWord ? 2 : 1);
    }

}
