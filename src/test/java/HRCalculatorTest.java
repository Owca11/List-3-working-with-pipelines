import org.example.HRCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HRCalculatorTest {
    @Test
    public void testValidMaxHR(){
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }
    @Test
    public void testInvalidMinHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(500));
    }
    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(-1));
    }
    @Test
    public void testWorkoutZones() {
        assertEquals("Moderate", HRCalculator.getWorkoutZone(40, 130));
        assertEquals("Light", HRCalculator.getWorkoutZone(30, 130));
        assertEquals("Hard", HRCalculator.getWorkoutZone(25, 170));
        assertEquals("Very Light", HRCalculator.getWorkoutZone(20, 100));
        assertEquals("Maximum", HRCalculator.getWorkoutZone(35, 185));
        assertEquals("Resting", HRCalculator.getWorkoutZone(50, 80));
    }
}