
package com.napier.sem;

import com.napier.sem.App;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * this class contains temporary example unit tests
 */
public class AppTest {

    /**
     * example unit test which should pass
     */
    @Test
    public void unitTest()
    {
        assertEquals(5, 5);
    }

    /**
     * example unit test which should fail
     */
    @Test
    public void unitTest2()
    {
        assertEquals(5, 4);
    }
}
