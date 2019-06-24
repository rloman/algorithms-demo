package nl.hanze.datastructures.reclist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecListTest {

    private RecList list;

    @Before
    public void setup() {
        this.list = new RecList();
    }

    @Test
    public void testRecList() {

        this.list.add(3);
        this.list.add(4);
        this.list.add(5);

        Assert.assertEquals(3, this.list.size());

    }
}
