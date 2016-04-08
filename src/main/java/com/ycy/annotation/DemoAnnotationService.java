package com.ycy.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by ycy on 16/4/8.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解连接add方法操作")
    public void add(){
        System.out.println("DemoAnnotationService执行add方法");
    }
}
