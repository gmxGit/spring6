import com.atguigu.spring6.annaop.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyTest {
//    public static void main(String[] args) {
//        CalculatorProxyFactory proxyFactory = new CalculatorProxyFactory(new CalculatorImp());
//        Calculator proxy = (Calculator)proxyFactory.getProxy();
//        int addresult = proxy.add(1, 3);
//        System.out.println(addresult);
//    }
    @Test
    public void testAop(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-aop.xml");
        Calculator contextBean = context.getBean(Calculator.class);
        int add = contextBean.add(1, 2);
    }
}
