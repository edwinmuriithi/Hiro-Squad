import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquadTest {
    @Test
    @DisplayName("Check Squad Instantiates")
    public void creates_instanceOfSquad()
    {
        Squad squad = new Squad(5,"Squad A","Avengers");
        assertTrue(squad instanceof Squad);
    }
}