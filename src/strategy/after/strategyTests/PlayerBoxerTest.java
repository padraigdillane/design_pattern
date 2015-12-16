package strategy.after.strategyTests;

import org.junit.Assert;
import org.junit.Test;
import strategy.after.PlayerBoxer;

import static org.junit.Assert.*;

/**
 * Created by User on 16/12/2015.
 */
public class PlayerBoxerTest {
    PlayerBoxer playerBoxer = new PlayerBoxer(100);
    @Test
    public void testDecreasePlayerHealth() throws Exception {

    }

    @Test
    public void testGetHealth() throws Exception {
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
}