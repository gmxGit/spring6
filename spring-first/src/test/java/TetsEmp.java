import Di.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TetsEmp {
    @Test
    public void testEmp(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        emp.work();
    }
}
