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
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.clearState();
        assertSame(ctrl.getCurrentState(), ctrl.getGreenState());
    }
    @Test
    @DisplayName("Valid: Yellow SecondState")
    public void singletonSecondState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.clearState();
        ctrl.nextState();

        assertEquals(ctrl.getCurrentState(), ctrl.getYellowState());
    }
    @Test
    @DisplayName("Valid: Red ThirdState")
    public void singletonThirdState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.clearState();
        for(int i = 0; i < 2; i++){
            ctrl.nextState();
        }
        assertEquals(ctrl.getCurrentState(), ctrl.getRedState());
    }
    @Test
    @DisplayName("Valid: Yellow FourthState")
    public void singletonFourthState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.clearState();
        for(int i = 0; i < 3; i++){
            ctrl.nextState();
        }
        assertEquals(ctrl.getCurrentState(), ctrl.getYellowState());
    }
    @Test
    @DisplayName("Valid: Yellow FifthState")
    public void singletonFifthState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.clearState();
        for(int i = 0; i < 4; i++){
            ctrl.nextState();
        }
        assertEquals(ctrl.getCurrentState(), ctrl.getGreenState());
    }

}
