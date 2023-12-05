package iut.info3.betterstravaapi.betterstravaapi;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BetterStravaApiApplicationTests {
    @Test
    void contextLoads() {
        BetterStravaApiApplication app = new BetterStravaApiApplication();
        assertTrue(app.iWroteSomeNewCode());

    }

    @Test
    void dqs() {
        BetterStravaApiApplication app = new BetterStravaApiApplication();
        assertFalse(!app.iWroteSomeNewCode());

    }

}
