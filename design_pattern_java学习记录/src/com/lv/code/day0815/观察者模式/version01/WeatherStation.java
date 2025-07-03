package com.lv.code.day0815.观察者模式.version01;

/**
 * @version design_pattern.1.0
 * @Description: 测试类
 * @author: 吕星琪
 * @Date: 2023/8/15 上午 10:18
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay conditionDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        conditionDisplay.removeFromSubject();
    }
}
