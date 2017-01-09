package com.gm.Controller;

import com.gm.Model.User;
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
        setAttr("users", User.dao.find("select * from user"));
        render("now.html");
    }
}
