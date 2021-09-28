/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();

        assertEquals(3,classUnderTest.roll(3).length);

        assertTrue(classUnderTest.containsDuplicates(new int[]{2,2,3,4}));

        assertEquals(2.5,classUnderTest.average(new int[]{2,2,2,4}));

        assertArrayEquals(new int[]{2,2,2,2},classUnderTest.lowestAvg(new int[][]{{2,2,2,2},{3,3,3,3}}));
    }
}
