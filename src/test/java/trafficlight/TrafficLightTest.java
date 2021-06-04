package trafficlight;

import org.junit.jupiter.api.*;

import trafficlight.ctrl.TrafficLightCtrl;

import static org.junit.jupiter.api.Assertions.*;

public class TrafficLightTest {
    @BeforeAll
    public static void init() {
        System.out.println("Testing Exercise 2");
    }

    @AfterAll
    public static void finish() {
        System.out.println("Finished Testing Exercise 2");
    }

    @Test
    @DisplayName("Valid: GreenState FirstState")
    public void singletonFirstState(){
        assertEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getGreenState());
    }

    @Test
    @DisplayName("Invalid: GreenState FirstState")
    public void singletonFirstStateFalse(){
        assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getRedState());
    }


}
