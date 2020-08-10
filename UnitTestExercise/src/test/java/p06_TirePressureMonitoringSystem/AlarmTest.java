package p06_TirePressureMonitoringSystem;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AlarmTest {
    private static final Sensor fakeSensor = Mockito.mock(Sensor.class);

    @Test
    public void Test_IfSensorIsLow() {
        Mockito.when(fakeSensor.popNextPressurePsiValue()).thenReturn(16.0);
        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void Test_IfSensorIsHigh() {
        Mockito.when(fakeSensor.popNextPressurePsiValue()).thenReturn(22.0);
        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void Test_IfSensorISBetween17And21() {
        Mockito.when(fakeSensor.popNextPressurePsiValue()).thenReturn(19.0);
        Alarm alarm = new Alarm(fakeSensor);
        alarm.check();
        assertFalse(alarm.getAlarmOn());
    }

}