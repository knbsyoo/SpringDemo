package self.springmvc.service.impl;

import self.springmvc.service.inter.HelloServiceByIdName;

/**
 * Description
 */
public class HelloServiceByIdNameImpl implements HelloServiceByIdName {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceByIdName,Hello!");
    }
}
