package self.springmvc.service.impl;

import self.springmvc.service.inter.HelloService;

/**
 * Description
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
