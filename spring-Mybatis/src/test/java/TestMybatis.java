import cn.zyy.config.SpringConfig;
import cn.zyy.domain.Student;
import cn.zyy.mapper.StudentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Author: Zz
 * @Date: 2023/11/11/14:58
 * @Description: 致敬
 */
public class TestMybatis {

    @Test
    public void testMybatis(){

        ApplicationContext ioc =  new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentMapper bean = ioc.getBean(StudentMapper.class);
        List<Student> students =   bean.selectAll();
        System.out.println(students);

    }
}
