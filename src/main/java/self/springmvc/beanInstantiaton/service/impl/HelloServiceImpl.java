package self.springmvc.beanInstantiaton.service.impl;

import self.springmvc.beanInstantiaton.service.inter.HelloService;

/**
 * Description
 */
public class HelloServiceImpl implements HelloService {
    private String msg;
    public HelloServiceImpl(){

    }
    public HelloServiceImpl(String msg){
        this.msg = msg;
    }
    @Override
    public void sayHello() {
        if(null != this.msg){
            System.out.println(this.msg);
        }else {
            System.out.println("hello world");
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
