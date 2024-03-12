import com.itguigu.spring6.iocxml.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUserCom {
    @Test
    public void testComponent(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-jdbc.xml");
        User bean = context.getBean(User.class);
        System.out.println(bean);
    }
}
