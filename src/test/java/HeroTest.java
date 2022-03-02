import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    @DisplayName("Check if Hero Instantiates")
    public void createsInstanceOfHero()
    {
        Hero hero = new Hero("Stark",36,"Intelligence","Egotistic");
        assertTrue(hero instanceof Hero);
    }
    @Test
    @DisplayName("Check if names are saved")
    public void savesName()
    {
        Hero hero = new Hero("Stark",36,"Intelligence","Egotistic");
        assertEquals("Stark",hero.getName());
    }

    @Test
    @DisplayName("Check if age is saved")
    public void savesAge()
    {
        Hero hero = new Hero("Stark",36,"Intelligence","Egotistic");
        assertEquals(36,hero.getAge());
    }

    @Test
    @DisplayName("Check if powers are saved")
    public void saveSpecialPowers()
    {
        Hero hero = new Hero("Stark",30,"Intelligence","Egotistic");
        assertEquals("Intelligence",hero.getSpecial_power());
    }

}