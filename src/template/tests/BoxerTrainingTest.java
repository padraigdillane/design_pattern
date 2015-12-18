package template.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import template.GoodBoxerTraining;

public class BoxerTrainingTest {
    GoodBoxerTraining goodBoxer;

    @Before
    public void setUp() throws Exception {
        goodBoxer = new GoodBoxerTraining();
    }

    @After
    public void tearDown() throws Exception {
        goodBoxer = null;
    }


    @Test
    public void testGoodBoxerIsDoingCardio() throws Exception {
        Assert.assertEquals(goodBoxer.doCardio(), true);
    }

    @Test
    public void testGoodBoxerDoingWeights() throws Exception {
        Assert.assertEquals(goodBoxer.doWeights(),true);
    }

    @Test
    public void testGoodBoxerDoingBoxingSession() throws Exception {
        Assert.assertEquals(goodBoxer.doBoxingSession(), true);
    }

}