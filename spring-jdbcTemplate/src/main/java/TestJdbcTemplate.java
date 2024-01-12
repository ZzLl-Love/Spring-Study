import cn.zyy.config.SpringConfig;
import cn.zyy.domain.Student;
import cn.zyy.mapper.StudentMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;

/**
 * @Author: Zz
 * @Date: 2023/11/10/15:55
 * @Description: 致敬
 */
public class TestJdbcTemplate {


    ApplicationContext context = null;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(SpringConfig.class);

    }

    /**
     * 测试DataSource是否正确配置
     */
    @Test
    public void testDataSource(){
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);

    }

    /**
     * 测试JdbcTemplate能否正常拿到
     */
    @Test
    public void testJdbcTemplate(){
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        System.out.println(jdbcTemplate);

    }

    /**
     * 测试使用jdbcTemplate  add操作
     *
     */
    @Test
    public void testJdbcTemplate_add(){
        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);

        Student zyy = new Student(null, "zyy", 18, 1);
        int result= studentMapper.insert(zyy);

        if(result > 0){

            System.out.println("添加成功~");
        }else{
            System.out.println("添加失败~");

        }
    }


    /**
     * 测试使用jdbcTemplate query 操作
     */
    @Test
    public void testJdbcTemplate_query(){
        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
        Student student = studentMapper.queryStudent(5);
        System.out.println(student);
    }

    /**
     * 测试使用jdbcTemplate 批量添加操作
     */
    @Test
    public void testJdbcTemplate_batchSave(){

        StudentMapper studentMapper = context.getBean("studentMapper", StudentMapper.class);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(null, "zyy1", 19, 2));
        list.add(new Student(null, "zyy2", 19, 2));
        int[] result = studentMapper.insertsBath(list);
        for (int i : result) {
            System.out.println(i);
        }

    }
}
