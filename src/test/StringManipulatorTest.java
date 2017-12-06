package test;

import com.laboratory.StringManipulator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringManipulatorTest {
    private StringManipulator stringObject;
    private String mInputString;
    private String mResultString;

    @Parameterized.Parameters
    public static Collection<Object []> data() {
        Object[][] data = new Object[][] {
                { "", "" },
                { "Привет", "Привет" },
                { "Hello, мир!", "мир" },
                { "!2213ю12", "ю" },
                { "...", "" },
                { "Onе, twо, threе", "еое" },};
        return Arrays.asList(data);
    }

    public StringManipulatorTest(String inputString, String resultString) {
        this.mInputString = inputString;
        this.mResultString = resultString;
    }

    @Before
    public void initTest() {
        stringObject = new StringManipulator();
    }

    @Test
    public void testClearInputString() {
        String actual = stringObject.clearInputString(mInputString);
        assertEquals(mResultString, actual);
    }
}
