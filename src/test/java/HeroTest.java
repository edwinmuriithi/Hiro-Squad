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
}