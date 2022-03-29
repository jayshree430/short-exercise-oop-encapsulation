package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    /* Making the properties private, so that it cannot be accessed from outside the class.*/
    private String location;
    private double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }
    /*
    *  Adding getter methods for class attributes
    * */
    public String getLocation(){
        return location;
    }

    public double getTemperature(){
        return temperature;
    }

    public String print() {
      return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, check1(), check2(), fahrenheit());

    }
    /*Making the fahrenheit into separate method*/
    private double fahrenheit(){
        return  (9.0 / 5.0) * temperature + 32;
    }
    /*
    * Changing the access specifier of the below methods.
    *  So that they cannot be accessed outside this class
    * only functions within the class can call these methods.
    * */
    private String check1() {
        if (location == "London") {

            return "🌦";

        } else if (location == "California") {

            return "🌅";

        } else if (location == "Cape Town") {

            return "🌤";

        }
        return "🔆";
    }

    private String check2() {
        if (temperature > 30) {

            return "It's too hot 🥵!";

        } else if (temperature < 10) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
