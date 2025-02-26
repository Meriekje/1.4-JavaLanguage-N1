package nivell1.exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculateIDTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "00000000, T",
            "99999999, R",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q"
    })


    public void testValidId(int id, char expectedLetter) {
        assertEquals(expectedLetter, CalculateID.calculateLetter(id));
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "100000000"
    })
    public void testInvalidId(int invalidId) {
        assertThrows(IllegalArgumentException.class, () -> CalculateID.calculateLetter(invalidId));
    }
}
