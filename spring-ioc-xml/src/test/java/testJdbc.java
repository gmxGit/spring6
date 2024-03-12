import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testJdbc {
 @Test
    public void testJdbc(){
     ApplicationContext context=new ClassPathXmlApplicationContext("bean-jdbc.xml");
     DruidDataSource bean = context.getBean(DruidDataSource.class);
     System.out.println(bean.getUrl());
 }
}