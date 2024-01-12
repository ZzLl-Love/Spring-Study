package cn.zyy.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: Zz
 * @Date: 2023/11/09/11:43
 * @Description: 致敬
 *
 * =============
 *    切面类
 * =============
 */
@Component
@Aspect  //表示是一个切面类
public class SmartAnimalAspect {


    /**
     * 使用@Pointcut注解来抽取切入点表达式
     */
    @Pointcut(value="execution(public float cn.zyy.aspectj.SmartDog.getSum(float, float ))")
    public void myPointcut(){

    }

    /**
     * 前置通知
     */
    //@Before(value="execution(public float cn.zyy.aspectj.SmartDog.getSum(float, float ))")
    @Before(value ="myPointcut()" )
    public  void  f1(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f1方法执行前- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }

    /**
     * 返回通知
     */
    //@AfterReturning(value="execution(public float cn.zyy.aspectj.SmartDog.getSum(float, float ))")
    @AfterReturning(value = "myPointcut()")
    public  void  f2(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f2方法正常执行结束- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }


    /**
     * 异常通知
     */
    //@AfterThrowing(value="execution(public float cn.zyy.aspectj.SmartDog.getSum(float, float ))")
    @AfterThrowing(value = "myPointcut()")
    public  void  f3(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f3方法异常发生时执行- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }

    /**
     * 最终通知： 把f4方法切入到目标方法执行后  (不管是否发生了异常，都会执行finally)
     * @param joinPoint
     */
    //@After(value="execution(public float cn.zyy.aspectj.SmartDog.getSum(float, float ))")
    @After(value="myPointcut()")
    public  void  f4(JoinPoint joinPoint){
        //通过连接点对象 joinPoint ,可以获取方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("日志- - f4方法最终执行完毕- - 方法名" +signature.getName() + Arrays.asList(joinPoint.getArgs()));
    }

}
