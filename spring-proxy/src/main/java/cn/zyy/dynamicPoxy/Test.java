package cn.zyy.dynamicPoxy;

import cn.zyy.dynamicPoxy.domain.Student;
import cn.zyy.dynamicPoxy.invocation.TransactionHandler;
import cn.zyy.dynamicPoxy.service.IStudentService;
import cn.zyy.dynamicPoxy.service.impl.StudentServiceImpl;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @Author: Zz
 * @Date: 2023/11/08/15:36
 * @Description: 致敬
 */

public class Test {

    @org.junit.Test
    public void testSave(){
        //增强类对象
        DaoTransaction transaction = new DaoTransaction();
        //目标执行类
        IStudentService service = new StudentServiceImpl();
        //方法拦截处理器
        TransactionHandler handler = new TransactionHandler(transaction, service);
        //获取代理实例对象
        IStudentService proxyStudentService =(IStudentService) Proxy.newProxyInstance(StudentServiceImpl.class.getClassLoader(),
                StudentServiceImpl.class.getInterfaces(), handler);
        proxyStudentService.save();
        Student query = proxyStudentService.query(1L);
        saveProxyClass("D:\\十指波教育\\zyyCode\\SpringStudy\\spring-proxy\\src\\main\\java\\cn\\zyy\\dynamicPoxy");
    }

    /**
     * 查看代理类的反字节码文件
     * @param path
     */
    private static void saveProxyClass(String path){
        byte[] $proxy1s = ProxyGenerator.generateProxyClass("$Proxy1",
                StudentServiceImpl.class.getInterfaces());
        FileOutputStream out = null;
        try {
            out =  new FileOutputStream(new File(path + "$Proxy1.class"));
            out.write($proxy1s);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(out !=null){
                try {
                    out.flush();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
