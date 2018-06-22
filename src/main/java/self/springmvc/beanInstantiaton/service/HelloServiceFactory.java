package self.springmvc.beanInstantiaton.service;

import self.springmvc.beanInstantiaton.service.impl.HelloServiceImpl;
import self.springmvc.beanInstantiaton.service.inter.HelloService;

/**
 * Description
 */
public class HelloServiceFactory {
    public  HelloService getBean(){
        return new HelloServiceImpl();
    }
    public  HelloService getBean(String msg){
        return new HelloServiceImpl(msg);
    }
}
