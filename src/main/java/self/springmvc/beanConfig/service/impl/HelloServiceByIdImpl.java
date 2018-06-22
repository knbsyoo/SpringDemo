package self.springmvc.beanConfig.service.impl;

import self.springmvc.beanConfig.service.inter.HelloServiceById;

/**
 * Description
 */
public class HelloServiceByIdImpl implements HelloServiceById {
    @Override
    public void sayHello() {
        System.out.println("HelloServiceById,Hello!");
    }
}
