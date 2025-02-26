package nivell1.exercici3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTestTest {
    @Test
    public void testTriggerException() {
        ArrayTest arrayTest = new ArrayTest();
        assertThrows(ArrayIndexOutOfBoundsException.class, arrayTest::triggerException);
    }
}
