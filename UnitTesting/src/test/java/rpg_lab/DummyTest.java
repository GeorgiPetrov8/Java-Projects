package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    private static int DUMMY_HEALTH = 10;
    private static int DUMMY_XP = 10;
    private static int ATTACK_TAKEN = 10;
    private static int EXPECTED_HEALTH = 2;


    private Dummy dummy;

    @Before
    public void initialObject() {
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }

    @Test
    public void dummyLosesHealthIfAttacked() {
        dummy.takeAttack(ATTACK_TAKEN);
        Assert.assertEquals("Wrong attackPoints", EXPECTED_HEALTH, dummy.getHealth());
    }

    @Test(expected = AssertionError.class)
    public void dummyThrowsExceptionIfIsAttacked() {
        dummy.takeAttack(ATTACK_TAKEN);
        dummy.takeAttack(ATTACK_TAKEN);
        assertEquals("error", EXPECTED_HEALTH, this.dummy.getHealth());
    }

    @Test
    public void deadDummyCanGiveHp() {
        dummy.takeAttack(ATTACK_TAKEN);
        assertEquals("dummy is not dead", DUMMY_XP, dummy.giveExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCantGiveHp() {
        dummy.giveExperience();
    }

}