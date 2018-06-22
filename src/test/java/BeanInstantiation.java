import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import self.springmvc.beanInstantiaton.service.inter.HelloService;

/**
 * Description
 */
public class BeanInstantiation {
    @Test
    public void  test(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService helloService1 = beanFactory.getBean("bIHelloService1",HelloService.class);
        helloService1.sayHello();
        HelloService helloService2 = beanFactory.getBean("bIHelloService2",HelloService.class);
        helloService2.sayHello();
        HelloService helloService3 = beanFactory.getBean("bIHelloService3",HelloService.class);
        helloService3.sayHello();
        HelloService helloService4 = beanFactory.getBean("bIHelloService4",HelloService.class);
        helloService4.sayHello();
        HelloService helloService5 = beanFactory.getBean("bIHelloService5",HelloService.class);
        helloService5.sayHello();
        HelloService helloService6 = beanFactory.getBean("bIHelloService6",HelloService.class);
        helloService6.sayHello();
    }
}
