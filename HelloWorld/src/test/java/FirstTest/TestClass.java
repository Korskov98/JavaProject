package FirstTest;

import FirstProgram.FirstClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {
    @Test
    public void TestConvert(){
        FirstClass first = new FirstClass();
        assertEquals(3.22,first.converter(2));
    }
}
