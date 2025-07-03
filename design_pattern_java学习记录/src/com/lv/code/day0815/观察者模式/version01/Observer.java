package com.lv.code.day0815.观察者模式.version01;
//具体的观察者实现此接口
public interface Observer {
    void update(float temperature,float humidity,float pressure);
}
