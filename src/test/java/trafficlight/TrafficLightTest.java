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
    @DisplayName("Valid: Green FirstState")
    public void singletonFirstState(){
        assertEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getGreenState());
    }
    @Test
    @DisplayName("Invalid: Red FirstState")
    public void singletonFirstStateFalse1(){
        assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getRedState());
    }
    @Test
    @DisplayName("Invalid: Yellow FirstState")
    public void singletonFirstStateFalse2(){
        assertNotEquals(TrafficLightCtrl.getInstance().getCurrentState(), TrafficLightCtrl.getInstance().getYellowState());
    }

    @Test
    @DisplayName("Valid: Yellow SecondState")
    public void singletonSecondState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.nextState();
        assertEquals(ctrl.getCurrentState(), ctrl.getYellowState());
    }


}
