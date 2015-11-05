package mx.iteso.adapter.temperature.adapters;

import mx.iteso.adapter.temperature.CelsiusReporter;
import mx.iteso.adapter.temperature.TemperatureInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TemperatureClassReporter is a class adapter.
// It extends CelciusReporter (the adaptee) and implements TemperatureInfo (the target interface).
// If a temperature is in Celcius, TemperatureClassReporter utilizes the temperatureInC value from CelciusReporter.
// Fahrenheit requests are internally handled in Celcius.

public class TemperatureClassReporterTest  {
    TemperatureClassReporter reporter;
    @Before
    public void setUp(){
        reporter = new TemperatureClassReporter();
    }
    @Test
    public void getTemperatureInFahrenheitTest() {
        reporter.setTemperatureInFahrenheit(10);
        assertEquals(reporter.getTemperatureInFahrenheit(),10.0,0);
    }
    @Test
    public void getTemperatureInCelsiusTest() {
        reporter.setTemperatureInCelsius(10);
        assertEquals(reporter.getTemperatureInCelsius(),10.0,0);

    }

}
