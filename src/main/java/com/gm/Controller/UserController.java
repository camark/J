package com.gm.Controller;

import com.gm.Model.User;
import com.jfinal.core.Controller;

/**
 * Created by MingGong on 2017/1/9.
 */
public class UserController extends Controller {

    public void newUser(){
        setAttr("Information","New User");
        render("new.html");
    }

    public void doSave(){
        User user=getModel(User.class);

        user.save();
        redirect("/");
    }
}
