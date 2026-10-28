package com.edwardnoaland.wave.d;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectDTest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-d:7", WaveProjectD.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectD.calculate(0));
    }
}
