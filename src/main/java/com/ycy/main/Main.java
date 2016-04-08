package com.ycy.main;

import com.ycy.annotation.DemoAnnotationService;
import com.ycy.method.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ycy on 16/4/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Aopconfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();
    }
}
