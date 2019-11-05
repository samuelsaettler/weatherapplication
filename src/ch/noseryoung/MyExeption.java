package ch.noseryoung;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

class MyException extends Exception {
    public MyException(String s, int cityid) {
        super(s);
        if (cityid != 2657896) {
      System.out.println("Wrong apiKey");
        }
    }
}
