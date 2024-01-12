package cn.zyy.cglibProxy;

import cn.zyy.cglibProxy.interceptor.CglibInterceptor;
import cn.zyy.cglibProxy.service.IStudentService;
import cn.zyy.cglibProxy.service.impl.StudentServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: Zz
 * @Date: 2023/11/08/20:55
 * @Description: 致敬
 */
public class Test {

    @org.junit.Test
    public void testCglib(){

        //生成目标代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\十指波教育\\zyyCode\\SpringStudy\\spring-proxy\\src\\main\\java\\cn\\zyy\\cglibProxy");

        //得到方法拦截器
        CglibInterceptor interceptor = new CglibInterceptor(new DaoTransaction());

        //使用CGLIB框架生成目标类的子类 ，子类就是代理类 实现增强
        Enhancer enhancer = new Enhancer();

        //设置父类字节码
        enhancer.setSuperclass(StudentServiceImpl.class);

        //设置拦截处理
        enhancer.setCallback(interceptor);


        IStudentService service =  (IStudentService)enhancer.create();

        service.save();
    }
}
