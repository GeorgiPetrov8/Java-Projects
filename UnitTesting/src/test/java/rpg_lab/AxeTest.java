package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    private static int AXE_ATTACK = 10;
    private static int AXE_DURABILITY = 1;
    private static int DUMMY_HEALTH = 10;
    private static int DUMMY_XP = 10;
    private static int EXPECTED_DURABILITY = AXE_DURABILITY - 1;

    private Axe axe;
    private Dummy dummy;

    @Before
    public void InitializeTest() {
        this.axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }


    @Test
    public void testIfWeaponLosesDurabilityAfterEachAttack() {
        assertEquals("Wrong durability", EXPECTED_DURABILITY, this.axe.getDurabilityPoints());
    }


}