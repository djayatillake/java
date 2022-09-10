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

    private int distance;
    public int getHammingDistance() {
        char[] l = leftStrand.toCharArray();
        char[] r = rightStrand.toCharArray();
        for (int i = 0; i < l.length; i++) {
            if (l[i]!=r[i]) {
                distance++;
            }
        }
        return distance;
    }
}
