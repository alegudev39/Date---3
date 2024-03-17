import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {


    @Test
    void testFindYear() {
        OffsetDateTime dateString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int calculatedYear = Main.findYear(dateString);
        int fixedControlYear = 2023;

        assertEquals(fixedControlYear, calculatedYear);

    }

    @Test
    void testFindYearNotToPass() {
        OffsetDateTime dateString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int calculatedYear = Main.findYear(dateString);
        int fixedControlYear = 2021;

        assertEquals(fixedControlYear, calculatedYear);

    }

    @Test
    void testFindMonth() {
        OffsetDateTime dateString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int calculatedMonth = Main.findMonth(dateString);
        int fixedControlMonth = 3;

        assertEquals(fixedControlMonth, calculatedMonth);

    }

    @Test
    void testFindDayOfMonth() {

        OffsetDateTime dateString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int calculatedDayOfMonth = Main.findayOfMonth(dateString);
        int fixedControlDayOfMonth = 1;

        assertEquals(fixedControlDayOfMonth, calculatedDayOfMonth);

    }

}