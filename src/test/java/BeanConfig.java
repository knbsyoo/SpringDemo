import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import self.springmvc.beanConfig.service.inter.HelloServiceById;
import self.springmvc.beanConfig.service.inter.HelloServiceByIdName;
import self.springmvc.beanConfig.service.inter.HelloServiceByName;
import self.springmvc.beanConfig.service.inter.HelloServiceByType;

/**
 * IOC容器配置Bean
 * 主要内容：Bean的定义，获取
 * @Date: 2018/06/22
 */
public class BeanConfig {
    @Test
    public void testHelloService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据beanId获取bean
        HelloServiceById helloServiceById = context.getBean("helloServiceById", HelloServiceById.class); //从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现"，不需要知道他的实现类
        helloServiceById.sayHello();
        //观察ApplicationContext的结构，发现ApplicationContext的父类是ListableBeanFactory、HierarchicalBeanFactory的父类是BeanFactory
        HelloServiceById helloServiceById2 = beanFactory.getBean("helloServiceById", HelloServiceById.class); //从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现"，不需要知道他的实现类
        helloServiceById2.sayHello();

        //根据类型获取bean
        HelloServiceByType helloServiceByType = context.getBean(HelloServiceByType.class);
        helloServiceByType.sayHello();

        //根据名称获取bean
        HelloServiceByName helloServiceByName = beanFactory.getBean("helloServiceByName",HelloServiceByName.class);
        helloServiceByName.sayHello();

        //根据名称别名获取bean
        HelloServiceByIdName helloServiceByIdName = beanFactory.getBean("helloServiceByIdName",HelloServiceByIdName.class);
        helloServiceByIdName.sayHello();

        //根据别名获取bean
        HelloServiceByIdName helloServiceByIdName1 = beanFactory.getBean("helloServiceByIdName1",HelloServiceByIdName.class);
        helloServiceByIdName1.sayHello();
        HelloServiceByIdName helloServiceByIdName2 = beanFactory.getBean("helloServiceByIdName2",HelloServiceByIdName.class);
        helloServiceByIdName2.sayHello();
        HelloServiceByIdName helloServiceByIdName3 = beanFactory.getBean("helloServiceByIdName3",HelloServiceByIdName.class);
        helloServiceByIdName3.sayHello();
        HelloServiceByIdName helloServiceByIdName4 = beanFactory.getBean("helloServiceByIdName4",HelloServiceByIdName.class);
        helloServiceByIdName4.sayHello();
        //ClassPathXmlApplicationContext是ApplicationContext的实现，从classpath获取配置文件；FileSystemXmlApplicationContext是ApplicationContext的实现，从文件系统获取配置文件
        //除了测试代码和配置文件，其他代码都没有Spring框架的痕迹，低侵入式设计。
        //面向接口编程，可以通过配置文件来更换实现，易扩展测试。
        //Bean之间没有耦合关系，可以重用。
    }
}
