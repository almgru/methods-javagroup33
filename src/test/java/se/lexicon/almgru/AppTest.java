package se.lexicon.almgru;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void test_isAdult_success() {
        // Arrange
        int age = 18;
        boolean expected = true;

        // Act
        boolean actual = App.isAdult(age);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void test_isAdult_unsuccessful() {
        // Arrange
        int age = 10;

        // Act
        boolean actual = App.isAdult(age);

        // Assert
        assertFalse(actual);
    }
}
