import com.laboratory.StringManipulator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StringManipulatorTest {
    private StringManipulator stringObject;

    @Before
    public void setUp() {
        String string = "Пример текста для тестирования";
        stringObject = new StringManipulator(string);
    }
    @Test
    public void getIndexList() {

        ArrayList<Integer> exceptedList =
                new ArrayList<>(Arrays.asList(17, 18, 10, 14, 6, 18, 20, 6, 12, 19, 20, 1, 5,
                                              13, 33, 20, 6, 19, 20, 10, 18, 16, 3, 1, 15, 10, 33));
        assertEquals(exceptedList, stringObject.getIndexList());
    }
}