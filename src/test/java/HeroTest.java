import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    @DisplayName("Checks if Hero Instantiates")
    public void createsInstanceOfHero{
        Hero hero = new Hero("Hulk",30,"Strength","Anger issues");
        assertEquals(true, hero instanceof Hero);
    }

}