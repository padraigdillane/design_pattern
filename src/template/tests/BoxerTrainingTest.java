package template.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import template.GoodBoxer;

import static org.junit.Assert.*;

public class BoxerTrainingTest {
    GoodBoxer goodBoxer;

    @Before
    public void setUp() throws Exception {
        goodBoxer = new GoodBoxer();
    }

    @After
    public void tearDown() throws Exception {
        goodBoxer = null;
    }


    @Test
    public void boxerIsDoingCardio() throws Exception {
        Assert.assertEquals(goodBoxer.doCardio(), true);
    }

    @Test
    public void testDoWeights() throws Exception {
        Assert.assertEquals(goodBoxer.doWeights(),true);
    }

    @Test
    public void testDoBoxingSession() throws Exception {
        Assert.assertEquals(goodBoxer.doBoxingSession(), true);
    }

}