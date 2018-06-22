package self.springmvc.beanConfig.service.impl;

import self.springmvc.beanConfig.service.inter.HelloServiceByIdName;

/**
 * Description
 */
public class HelloServiceByIdNameImpl implements HelloServiceByIdName {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceByIdName,Hello!");
    }
}
