import cn.zyy.config.SpringConfig;
import cn.zyy.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Zz
 * @Date: 2023/11/10/10:53
 * @Description: 致敬
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class StudentTest {

    @Autowired
    private StudentMapper studentMapper;


    @Test
    public void testStudentMapper(){
        studentMapper.save();
    }
}



