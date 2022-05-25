import junit_test.AddNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAddNumbersTest {

    @Test
    public void testMath(){
        AddNumbers addNumbers = new AddNumbers();
        int result = addNumbers.myCalc(new int [] {3,4,5});
        assertEquals(12, result);
        System.out.println(result);
    }
}
