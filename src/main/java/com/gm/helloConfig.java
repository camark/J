package com.gm;

import com.gm.Controller.HelloController;
import com.gm.Controller.UserController;
import com.gm.Model.Blog;
import com.gm.Model.User;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;

/**
 * Created by MingGong on 2017/1/8.
 */
public class helloConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);

        constants.setBaseViewPath("/WEB-INF/views");
        //constants.setViewType(ViewType.JSP);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/",HelloController.class,"/hello");
        routes.add("/User", UserController.class,"/user");
    }

    @Override
    public void configPlugin(Plugins plugins) {
        loadPropertyFile("jdbc.properties");
        DruidPlugin druidPlugin = new DruidPlugin(getProperty("jdbcUrl"),getProperty("user"),getProperty("password"));
        plugins.add(druidPlugin);

        ActiveRecordPlugin activeRecordPlugin=new ActiveRecordPlugin(druidPlugin);
        plugins.add(activeRecordPlugin);
        activeRecordPlugin.addMapping("User", User.class);
        activeRecordPlugin.addMapping("Blog", Blog.class);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp",8080,"/",5);
    }
}
