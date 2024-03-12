import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxyFactory {
    private  Object target;

    public CalculatorProxyFactory(Object target) {
        this.target = target;
    }

    //返回代理对象
    public  Object getProxy(){
        //参数1 ClassLoader  加载动态代理类的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        //参数2 class[]
        Class[] interfaces = target.getClass().getInterfaces();
        //参数3 Invocation Handler：设置代理对象实现目标对象方法的过程
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[动态代理][日志]"+method.getName()+"参数"+ Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("[动态代理][日志]"+method.getName()+"结果"+result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
