package step4;

import static org.junit.Assert.*;

/**
 * Created by Pluck on 1/26/2016.
 */
public class TestTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        Test app = new Test();
        int expected = 5;
        int result = app.add(2, 3);

        assertEquals(expected, result);
    }


    @org.junit.Test
    public void testMultiply() throws Exception {
        Test app = new Test();
        int expected = 6;
        int result = app.multiply(2, 3);

        assertEquals(expected, result);
    }
}