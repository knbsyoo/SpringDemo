package self.springmvc.beanConfig.service.impl;

import self.springmvc.beanConfig.service.inter.HelloServiceByType;

/**
 * Description
 */
public class HelloServiceByTypeImpl implements HelloServiceByType {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceByType,Hello!");
    }

}
