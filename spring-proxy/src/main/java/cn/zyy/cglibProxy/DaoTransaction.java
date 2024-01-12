package cn.zyy.cglibProxy;

public class DaoTransaction {
    public void before(){
        System.out.println("开启事务操作");
    }

    public void after(){
        System.out.println("关闭事务");
    }
}