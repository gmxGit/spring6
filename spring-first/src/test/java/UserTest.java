import bean.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    private Logger logger= LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testUserObject() {
        //加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        //使用对象调用方法进行测试
        user.add();
        logger.info("打印日志");
    }

    @Test
    public void testUserObject1() throws Exception {
        //获取类Class对象
        Class aClass = Class.forName("bean.User");
        //调用方法创建对象
        User newInstance = (User) aClass.getDeclaredConstructor().newInstance();
        System.out.println(newInstance);
    }
}
