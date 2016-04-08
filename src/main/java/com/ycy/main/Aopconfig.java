package com.ycy.main;

import com.ycy.annotation.DemoAnnotationService;
import com.ycy.method.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by ycy on 16/4/8.
 */
@Configuration
@ComponentScan("com.ycy")
@EnableAspectJAutoProxy//1
public class Aopconfig {

}
