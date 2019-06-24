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

    @Test
    public void testGgd() {
        Assert.assertEquals(9, Algorithmiek.ggd(27, 18));
        Assert.assertEquals(6, Algorithmiek.ggd(18,6));
        Assert.assertEquals(1, Algorithmiek.ggd(15,7));
        Assert.assertEquals(10, Algorithmiek.ggd(100, 30));
    }

    @Test
    public void testKgv() {
        Assert.assertEquals(300, Algorithmiek.kgv(100, 30));
        Assert.assertEquals(105, Algorithmiek.kgv(15,7));
        Assert.assertEquals(15, Algorithmiek.kgv(15,5));
    }
}
