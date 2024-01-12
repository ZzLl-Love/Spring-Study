package cn.zyy.aspectj;

import org.springframework.stereotype.Component;

/**
 * @Author: Zz
 * @Date: 2023/11/09/11:35
 * @Description:
 *
 */
@Component
public class SmartDog implements SmartAnimalable {

    @Override
    public float getSum(float i, float j) {
        float  result = i + j;
        System.out.println("方法内部打印result = " + result);

        //模拟异常，则是异常通知
        //int k = 10/0;
        return  result;
    }

    @Override
    public float getSub(float i, float j) {
         float result = i - j;
        System.out.println("方法内部打印result = " + result);
        return result;
    }
}
