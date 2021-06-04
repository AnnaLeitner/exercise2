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
    @Test
    @DisplayName("Invalid: Greens SecondState")
    public void singletonSecondStateFalse1(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.nextState();
        assertNotEquals(ctrl.getCurrentState(), ctrl.getGreenState());
    }
    @Test
    @DisplayName("Invalid: Red SecondState")
    public void singletonSecondStateFalse2(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.nextState();
        assertNotEquals(ctrl.getCurrentState(), ctrl.getRedState());
    }

    @Test
    @DisplayName("Valid: Red ThirdState")
    public void singletonThirdState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        for(int i = 0; i<=1; i++){
            ctrl.nextState();
        }
        assertEquals(ctrl.getCurrentState(), ctrl.getRedState());
    }
    @Test
    @DisplayName("Invalid: Yellow ThirdState")
    public void singletonThirdStateFalse1(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        for(int i = 0; i<=1; i++){
            ctrl.nextState();
        }
        assertNotEquals(ctrl.getCurrentState(), ctrl.getYellowState());
    }
    @Test
    @DisplayName("Invalid: Green ThirdState")
    public void singletonThirdStateFalse2(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        for(int i = 0; i<=1; i++){
            ctrl.nextState();
        }
        assertNotEquals(ctrl.getCurrentState(), ctrl.getGreenState());
    }

    @Test
    @DisplayName("Valid: Yellow FourthState")
    public void singletonFourthState(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        for(int i = 0; i<=2; i++){
            ctrl.nextState();
        }
        assertEquals(ctrl.getCurrentState(), ctrl.getYellowState());
    }
    @Test
    @DisplayName("Invalid: Red FourthState")
    public void singletonFourthStateFalse1(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        for(int i = 0; i<=2; i++){
            ctrl.nextState();
        }
        assertNotEquals(ctrl.getCurrentState(), ctrl.getRedState());
    }
    @Test
    @DisplayName("Invalid: Green FourthState")
    public void singletonFourthStateFalse2(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        for(int i = 0; i<=2; i++){
            ctrl.nextState();
        }
        assertNotEquals(ctrl.getCurrentState(), ctrl.getGreenState());
    }

}
