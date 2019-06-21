package nl.hanze.algoritmiek;

import org.junit.Assert;
import org.junit.Test;

public class AlgorithmiekTest {

    @Test
    public void testAlgorithmiekFaculteit() {
        Assert.assertEquals(6, Algorithmiek.faculteit(3));
        Assert.assertEquals(24, Algorithmiek.faculteit(4));
        Assert.assertEquals(120, Algorithmiek.faculteit(5));
    }
}
