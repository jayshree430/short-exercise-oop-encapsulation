package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeatherReporterTest {
    WeatherReporter london;
    WeatherReporter california;
    WeatherReporter capeTown;

    @BeforeEach
    void setup(){
        london = new WeatherReporter("London", 15);
        california = new WeatherReporter("California", 47);
        capeTown = new WeatherReporter("Cape Town", 9);
    }

    @Test
    void checkLocationForLondon() {
        assertEquals("London", london.getLocation());
    }
    @Test
    void checkLocationForCalifornia(){
        assertEquals("California", california.getLocation());
    }

    @Test
    void checkTemperatureForCapeTown(){
        assertEquals(9, capeTown.getTemperature());
    }

    @Test
    void checkTemperatureForLondon(){
        assertEquals(15, london.getTemperature());
    }

}
