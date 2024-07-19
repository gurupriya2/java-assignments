package test.java.model;

import ecz.model.AddMethods;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddMethodsTest {

    @Test
    public void testAddIntInt() {
        AddMethods addMethods = new AddMethods();
        int result = addMethods.add(50, 30);
        assertEquals(80, result);
    }

    @Test
    public void testAddIntIntInt() {
        AddMethods addMethods = new AddMethods();
        int result = addMethods.add(8, 9, 5);
        assertEquals(22, result);
    }

    @Test
    public void testAddFloatFloat() {
        AddMethods addMethods = new AddMethods();
        float result = addMethods.add(56.3f, 67.0f);
        assertEquals(123.3f, result, 0.0001);
    }

    @Test
    public void testAddStringInt() {
        AddMethods addMethods = new AddMethods();
        String result = addMethods.add("hello ", 67);
        assertEquals("hello 67", result);
    }
}
