package com.lv.code.day0816.工厂模式.version03.california_style;

import com.lv.code.day0816.工厂模式.version03.Pizza;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 11:27
 * @since jdk1.0
 */
public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name="加利福尼亚奶酪披萨";//芝加哥风味深盘奶酪披萨
        dough="双层面团";//超厚面团
        sauce="菠萝西瓜酱"; //梅子番茄酱
        toppings.add("加利福尼亚特产奶酪块"); //马苏里拉奶酪丝
    }
}
