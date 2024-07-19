package test.java.model;


import ecz.model.AddMethods;
import org.junit.Test;
import static org.junit.Assert.*;

    public class AddMethodsEdgeCaseTest {

        @Test
        public void testAddIntInt_maxValues() {
            AddMethods addMethods = new AddMethods();
            int result = addMethods.add(Integer.MAX_VALUE, 1);
            assertEquals(Integer.MIN_VALUE, result); // Integer overflow
        }

        @Test
        public void testAddIntInt_minValues() {
            AddMethods addMethods = new AddMethods();
            int result = addMethods.add(Integer.MIN_VALUE, -1);
            assertEquals(Integer.MAX_VALUE, result); // Integer underflow
        }

        @Test
        public void testAddIntInt_zero() {
            AddMethods addMethods = new AddMethods();
            int result = addMethods.add(0, 50);
            assertEquals(50, result);
        }

        @Test
        public void testAddIntIntInt_maxValues() {
            AddMethods addMethods = new AddMethods();
            int result = addMethods.add(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            assertEquals(Integer.MAX_VALUE * 3, result); // Overflow check
        }

        @Test
        public void testAddIntIntInt_minValues() {
            AddMethods addMethods = new AddMethods();
            int result = addMethods.add(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            assertEquals(Integer.MIN_VALUE * 3, result); // Underflow check
        }

        @Test
        public void testAddIntIntInt_zero() {
            AddMethods addMethods = new AddMethods();
            int result = addMethods.add(0, 0, 0);
            assertEquals(0, result);
        }

        @Test
        public void testAddFloatFloat_maxValues() {
            AddMethods addMethods = new AddMethods();
            float result = addMethods.add(Float.MAX_VALUE, 1.0f);
            assertFalse(Float.isInfinite(result)); // Overflow check
        }

        @Test
        public void testAddFloatFloat_minValues() {
            AddMethods addMethods = new AddMethods();
            float result = addMethods.add(-Float.MAX_VALUE, -1.0f);
            assertFalse(Float.isInfinite(result)); // Underflow check
        }

        @Test
        public void testAddFloatFloat_zero() {
            AddMethods addMethods = new AddMethods();
            float result = addMethods.add(0.0f, 123.45f);
            assertEquals(123.45f, result, 0.0001);
        }

        @Test
        public void testAddFloatFloat_smallValues() {
            AddMethods addMethods = new AddMethods();
            float result = addMethods.add(1.0e-10f, 1.0e-10f);
            assertEquals(2.0e-10f, result, 1.0e-15f);
        }

        @Test
        public void testAddStringInt_emptyString() {
            AddMethods addMethods = new AddMethods();
            String result = addMethods.add("", 123);
            assertEquals("123", result);
        }

        @Test
        public void testAddStringInt_largeInteger() {
            AddMethods addMethods = new AddMethods();
            String result = addMethods.add("Large number: ", Integer.MAX_VALUE);
            assertEquals("Large number: 2147483647", result);
        }

        @Test
        public void testAddStringInt_negativeInteger() {
            AddMethods addMethods = new AddMethods();
            String result = addMethods.add("Negative number: ", -123);
            assertEquals("Negative number: -123", result);
        }

        @Test
        public void testAddStringInt_nullString() {
            AddMethods addMethods = new AddMethods();
            String result = addMethods.add(null, 123);
            assertEquals("null123", result);
        }
    }


