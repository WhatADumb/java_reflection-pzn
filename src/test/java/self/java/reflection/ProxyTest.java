package self.java.reflection;

import org.junit.jupiter.api.Test;
import self.java.reflection.data.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    void testProxy() {
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("getName")){
                    return "Proxy Car";
                }
                if (method.getName().equals("run")){
                    System.out.println("Car Start Engine");
                }
                return null;
            }
        };

        Car car = (Car) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Car.class}, invocationHandler);
        System.out.println(car.getClass());
        System.out.println(car.getName());
        car.run();
    }
}
