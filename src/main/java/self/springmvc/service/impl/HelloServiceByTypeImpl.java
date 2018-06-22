package self.springmvc.service.impl;

import self.springmvc.service.inter.HelloServiceByType;

/**
 * Description
 */
public class HelloServiceByTypeImpl implements HelloServiceByType {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceByType,Hello!");
    }

}
