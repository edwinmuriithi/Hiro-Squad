import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquadTest {
    @Test
    @DisplayName("Check Squad Instantiates")
    public void creates_instanceOfSquad()
    {
        Squad squad = new Squad(5,"Avengers","Protecting Earth");
        assertTrue(squad instanceof Squad);
    }

    @Test
    @DisplayName("Check max size")
    public void savesMaxSize()
    {
        Squad squad = new Squad(5,"Avengers","Protecting Earth");
        assertEquals(5, squad.getMax_size());
    }

    @Test
    @DisplayName("Check if Squad Name is Saved")
    public void savesSquadName()
    {
        Squad squad = new Squad(5,"Avengers","Protecting Earth");
        assertEquals("Avengers", squad.getName());
    }
    @Test
    @DisplayName("Saves Squad Purpose")
    public void savesSquadPurpose()
    {
        Squad squad = new Squad(5,"Avengers","Protecting Earth");
        assertEquals("Protecting Earth", squad.getCause());
    }

    @Test
    @DisplayName("Saves all Squads")
    public void all_returns_all_instancesOfSquad()
    {
        Squad squad = new Squad(5,"Avengers","Protecting Earth");
        Squad squad2 = new Squad(5,"Guardians of the galaxy","Protecting the galaxy");
        assertTrue(Squad.all().contains(squad));
        assertTrue(Squad.all().contains(squad2));

    }

    @Test
    @DisplayName("Deletes all data")
    public void clear_emptiesAllSquadsFromList_0() {
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
}