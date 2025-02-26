package nivell1.exercici2;

public class CalculateID {

    private static final char[] LETTERS ={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; // Corresponding letters


    public static char calculateLetter(int id) {
        if (id < 0 || id > 99999999) {
            throw new IllegalArgumentException("The ID number must be between 0 and 99999999");
        }
        return LETTERS[id % 23];
    }

}
