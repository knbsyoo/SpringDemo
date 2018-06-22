package self.springmvc.service.impl;

import self.springmvc.service.inter.HelloServiceById;

/**
 * Description
 */
public class HelloServiceByIdImpl implements HelloServiceById {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceById,Hello!");
    }
}
