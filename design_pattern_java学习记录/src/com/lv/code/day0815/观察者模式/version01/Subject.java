package com.lv.code.day0815.观察者模式.version01;
//主题接口，所有改变自身状态并想要通知多个其他对象的类都可以实现此接口成为具体的主题
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    //主题状态改变时调用此方法通知观察者
    void notifyObserver();
}
