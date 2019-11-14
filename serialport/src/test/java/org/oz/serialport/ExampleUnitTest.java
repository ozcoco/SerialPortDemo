package org.oz.serialport;

import org.junit.Test;

import java.io.FileDescriptor;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest
{
    @Test
    public void addition_isCorrect()
    {
        FileDescriptor fd = new FileDescriptor();

        assertEquals(4, 2 + 2);
    }
}