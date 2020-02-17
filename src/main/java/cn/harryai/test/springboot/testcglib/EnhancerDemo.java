package cn.harryai.test.springboot.testcglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Harry
 * @since 2020/02/16 20:25
 **/
public class EnhancerDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        enhancer.setCallback(new MethodInterceptorImpl());

        EnhancerDemo demo = (EnhancerDemo) enhancer.create();
        demo.test();


//        System.out.println(demo);

    }

    public void test() {
        System.out.println("EnhancerDemo.test");
    }

    private static class MethodInterceptorImpl implements MethodInterceptor {


        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("before invoke method" + method.getName());
            Object o1 = methodProxy.invokeSuper(o, objects);
            System.out.println("end invoke method" + method.getName());
            return o1;
        }
    }
}
