import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean-jdbc.xml")
public class testJdbc {
    //    @Test
//    public void testJdbc() {
//     ApplicationContext context=new ClassPathXmlApplicationContext("bean-jdbc.xml");
//        DruidDataSource bean = context.getBean(DruidDataSource.class);
//        System.out.println(bean.getUrl());
//    }
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "insert into t_emp values(null,?,?,?)";
        jdbcTemplate.update(sql, "小王", "21", "女");
        jdbcTemplate.update(sql, "lili", "22", "女");
        jdbcTemplate.update(sql, "liangliang", "23", "男");
    }

    @Test
    public void updateFromEmpTest() {
        String sql = "update  t_emp set name=?,age=? where id=?";
        jdbcTemplate.update(sql, "小李", "22", "2");
    }

    @Test
    public void deleteFromEmpTest() {
        String sql = "delete from t_emp where id=?";
        jdbcTemplate.update(sql, 2);
    }

    @Test
    public void queryFromEmp() {
        String sql = "select * from t_emp where id=?";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(query);
    }

}