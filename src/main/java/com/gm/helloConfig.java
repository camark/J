package com.gm;

import com.gm.Controller.HelloController;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
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
    }

    @Override
    public void configPlugin(Plugins plugins) {

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
