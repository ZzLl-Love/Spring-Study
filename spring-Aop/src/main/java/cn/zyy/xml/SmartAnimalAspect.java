package cn.zyy.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 通过spring配置文件来配置AOP 切面类--xml配置文件体现
 */


public class SmartAnimalAspect {

    public  void  f1(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f1方法执行前- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "myPointcut()")
    public  void  f2(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f2方法正常执行结束- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }



    public  void  f3(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f3方法异常发生时执行- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }


    @After(value="myPointcut()")
    public  void  f4(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f4方法最终执行完毕- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }

}
