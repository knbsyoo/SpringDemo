package self.springmvc.beanConfig.service.impl;

import self.springmvc.beanConfig.service.inter.HelloServiceByName;

/**
 * Description
 */
public class HelloServiceByNameImpl implements HelloServiceByName {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceByName,Hello!");
    }

}
