package se.lexicon.almgru;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public void test_isAdult() {
        // Arrange
        int age = 18;
        boolean expected = true;

        // Act
        boolean actual = App.isAdult(age);

        // Assert
        assertEquals(expected, actual);
    }
}
