package mx.iteso.adapter.temperature.adapters;

import mx.iteso.adapter.temperature.CelsiusReporter;
import mx.iteso.adapter.temperature.TemperatureInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

// TemperatureObjectReporter is an object adapter.
// It is similar in functionality to TemperatureClassReporter,
// except that it utilizes composition for the CelciusReporter
// rather than inheritance.

public class TemperatureObjectReporterTest {


    //CelsiusReporter celsiusReporter;
    TemperatureObjectReporter temp;
    @Before
    public void setUp(){
       // celsiusReporter = mock(CelsiusReporter.class);
        temp = new TemperatureObjectReporter();
    }

    @Test
    public void getTemperatureInFahrenheitTest() {
        temp.setTemperatureInFahrenheit(10);
        assertEquals(temp.getTemperatureInFahrenheit(),10,0);

    }
    @Test
    public void getTemperatureInCelsiusTest() {
        temp.setTemperatureInCelsius(10);
        assertEquals(temp.getTemperatureInCelsius(),10,0);
    }

}
