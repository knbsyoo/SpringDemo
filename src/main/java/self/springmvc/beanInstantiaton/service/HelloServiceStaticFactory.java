package self.springmvc.beanInstantiaton.service;

import self.springmvc.beanInstantiaton.service.impl.HelloServiceImpl;
import self.springmvc.beanInstantiaton.service.inter.HelloService;

/**
 * Description
 */
public class HelloServiceStaticFactory {
    public static HelloService getBean(){
        return new HelloServiceImpl();
    }
    public static HelloService getBean(String msg){
        return new HelloServiceImpl(msg);
    }
}
