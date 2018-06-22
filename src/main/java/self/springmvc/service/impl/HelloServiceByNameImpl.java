package self.springmvc.service.impl;

import self.springmvc.service.inter.HelloServiceByName;

/**
 * Description
 */
public class HelloServiceByNameImpl implements HelloServiceByName {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceByName,Hello!");
    }

}
