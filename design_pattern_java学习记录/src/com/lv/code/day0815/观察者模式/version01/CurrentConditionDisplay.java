package com.lv.code.day0815.观察者模式.version01;

/**
 * @version design_pattern.1.0
 * @Description: 当前气象状况布告板
 * @author: 吕星琪
 * @Date: 2023/8/15 上午 10:08
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private final Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("CurrentConditions:"+temperature+
                "F degree and "+humidity+"% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    public void removeFromSubject(){
        weatherData.removeObserver(this);
    }

}
