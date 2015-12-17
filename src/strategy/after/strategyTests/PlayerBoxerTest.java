package strategy.after.strategyTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import strategy.after.PlayerBoxer;

import static org.junit.Assert.*;

/**
 * Created by User on 16/12/2015.
 */
public class PlayerBoxerTest {

    private PlayerBoxer playerBoxer;

    @Before
    public void setUp() throws Exception{
        System.out.println("Setting it up!");
        playerBoxer = new PlayerBoxer(100);
    }

    @Test
    public void testDecreasePlayerHealth() throws Exception {
        playerBoxer.decreasePlayerHealth(50);
        Assert.assertEquals(playerBoxer.getHealth(), 50);
    }

    @Test
    public void testPlayerHasFullHealth() throws Exception {
        Assert.assertEquals(playerBoxer.getHealth(), 100);
    }


    @Test
    public void testAttacking() throws Exception {

    }

    @Test
    public void testJab() throws Exception {

    }

    @Test
    public void testHook() throws Exception {

    }

    @Test
    public void testUppercut() throws Exception {

    }

    @Test
    public void testSurvive() throws Exception {

    }

    @Test
    public void testBlock() throws Exception {

    }

    @Test
    public void testKnockedOut() throws Exception {

    }

    @Test
    public void testClinch() throws Exception {

    }

    @Test
    public void testCautious() throws Exception {

    }

    @After
    public void tearDown() throws Exception{
        System.out.println("Running: tearDown");
        playerBoxer = null;
        assertNull(playerBoxer);
    }
}