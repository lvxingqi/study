package com.lv.code.day0817.抽象工厂模式.pizza;

import com.lv.code.day0817.抽象工厂模式.material.cheese.Cheese;
import com.lv.code.day0817.抽象工厂模式.material.clams.Clams;
import com.lv.code.day0817.抽象工厂模式.material.dough.Dough;
import com.lv.code.day0817.抽象工厂模式.material.pepperoni.Pepperoni;
import com.lv.code.day0817.抽象工厂模式.material.sauce.Sauce;
import com.lv.code.day0817.抽象工厂模式.material.veggies.Veggies;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/16 上午 10:41
 * @since jdk1.0
 */
public abstract class Pizza {
    public String name; //披萨名字
    public Dough dough; //面团
    public Sauce sauce; //酱
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    //prepare()方法只需要准备原料即可，由具体的Pizza去实现,需要的原料可能不同，所以抽象
    public abstract void prepare();
    public void bake(){
        System.out.println("350°烤制25分钟");
    }
    public void cut(){
        System.out.println("切成对角线");
    }
    public void box(){
        System.out.println("装进披萨店的圆形盒子里");
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
