package com.gm.Controller;

import com.jfinal.core.Controller;

import java.util.Date;

/**
 * Created by MingGong on 2017/1/8.
 */
public class HelloController extends Controller {

    public void index(){
        renderText("Hello from JFinal");
    }

    public void now()
    {
        render("/hello/now.html");
    }
}
