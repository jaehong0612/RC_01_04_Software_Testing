
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    @Test
    public void getNumberOfupperCaseCharactersInString_return_0(){
            String str = null;

            int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
            assertTrue(result == 0);
        }

    @Test
    public void 빈값체크(){
        String str ="";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertTrue(result == 0);
    }

    @Test
    public void 대문자_ABC(){
        String str = "ABC";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 3);
        assertFalse(result == 2);
        System.out.println("result ::"+result);
    }
}