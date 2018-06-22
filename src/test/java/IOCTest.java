import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import self.springmvc.service.inter.HelloService;

/**
 * Description
 */
public class IOCTest {
    @Test
    public void testHelloService(){
        //ClassPathXmlApplicationContext是ApplicationContext的实现，从classpath获取配置文件
        //FileSystemXmlApplicationContext是ApplicationContext的实现，从文件系统获取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ///从容器中获取Bean，注意此处完全"面向接口编程，而不是面向实现"，不需要知道他的实现类
        HelloService helloService = context.getBean("helloService", HelloService.class);
        helloService.sayHello();

        //除了测试代码和配置文件，其他代码都没有Spring框架的痕迹，低侵入式设计。
        //面向接口编程，可以通过配置文件来更换实现，易扩展测试。
        //Bean之间没有耦合关系，可以重用。
    }
}
