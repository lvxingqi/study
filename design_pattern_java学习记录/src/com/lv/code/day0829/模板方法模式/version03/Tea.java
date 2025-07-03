package com.lv.code.day0829.模板方法模式.version03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 09:20
 * @Description
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("用沸水冲泡茶");
    }

    @Override
    void addCondiments() {
        System.out.println("添加柠檬");
    }

    @Override
    boolean customerWantsCondiments() {
        return getUserInput().equalsIgnoreCase("y");
    }

    public String getUserInput(){
        System.out.println("你想要调料吗？y or n");
        String answer=null;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (answer==null){
            return "no";
        }
        return answer;
    }
}
