package com.lv.code.day0829.模板方法模式.version03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 下午 02:37
 * @Description
 */
public class TestTemplate {
    public static void main(String[] args) {
        Tea tea=new Tea();
        tea.prepareRecipe();
    }

}
