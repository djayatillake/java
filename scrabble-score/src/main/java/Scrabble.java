import java.util.stream.IntStream;

class Scrabble {
    private String word;
    private char[] wordArray;
    private boolean doubleWord;
    private boolean tripleWord;
    private String doubleLetter;
    private char[] doubleArray;
    private String tripleLetter;
    private char[] tripleArray;

    Scrabble(String word, boolean tripleWord, boolean doubleWord, String tripleLetter, String doubleLetter) {
        this.word = word;
        this.wordArray = word.toUpperCase().toCharArray();
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
        this.doubleLetter = doubleLetter;
        this.tripleLetter = tripleLetter;
        this.doubleArray = doubleLetter.toUpperCase().toCharArray();
        this.tripleArray = tripleLetter.toUpperCase().toCharArray();
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

    private int wordScore(char[] chars) {
        return chars == null ? 0 : (int) IntStream.range(0, chars.length)
                .map(i -> letterScore(chars[i]))
                .sum();
    }

    int getScore() {
        return (wordScore(wordArray) + wordScore(doubleArray) + wordScore(tripleArray) * 2) * (tripleWord ? 3 : 1) * (doubleWord ? 2 : 1);
    }

}
