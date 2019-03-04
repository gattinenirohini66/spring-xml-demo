package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean)context.getBean("BeanLifecycle");
    }
}
