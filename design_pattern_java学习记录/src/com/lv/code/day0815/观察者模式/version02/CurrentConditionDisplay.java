package com.lv.code.day0815.观察者模式.version02;

import com.lv.code.day0815.观察者模式.version01.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @version design_pattern.1.0
 * @Description: 当前气象状况布告板
 * @author: 吕星琪
 * @Date: 2023/8/15 上午 10:08
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable weatherData){
        weatherData.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData=(WeatherData) o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("CurrentConditions:"+temperature+
                "F degree and "+humidity+"% humidity");
    }
}
