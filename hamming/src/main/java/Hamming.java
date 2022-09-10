import java.util.stream.IntStream;

public class Hamming {
    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (this.leftStrand.isBlank() && !this.rightStrand.isBlank()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (this.rightStrand.isBlank() && !this.leftStrand.isBlank()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (this.leftStrand.length() != this.rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        return (int) IntStream.range(0, leftStrand.length())
            .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
            .count();
    }
}
