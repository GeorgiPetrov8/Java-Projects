package rpg_lab;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {
    private static String HERO_NAME = "Georgi";
    private static int TARGET_XP = 10;


    @Test
    public void attackGainsExperienceIfTargetIsDead() {
        Weapon weaponMock = Mockito.mock(Weapon.class);
        Target targetMock = Mockito.mock(Target.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_XP);

        Hero hero = new Hero(HERO_NAME, weaponMock);

        hero.attack(targetMock);

        assertEquals("Wrong experience", TARGET_XP, hero.getExperience());
    }

}