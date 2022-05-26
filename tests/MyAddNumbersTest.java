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

// AssertEquals checks whether the LHS and RHS are equal.
// Assert True is used to check whether a condition is true
// Also available: AssertFalse
// AssertNotNull
// AssertNull
// Compare Arrays: assertArrayEquals(arr1, arr2)