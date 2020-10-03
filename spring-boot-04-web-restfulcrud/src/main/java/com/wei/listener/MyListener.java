package com.wei.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author abo
 * @date 2020/10/3 17:38
 * @remarks
 **/
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("web启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("web销毁");
    }
}
