package cn.homework01.domain;

/**
 * @Author: Zz
 * @Date: 2023/11/06/21:24
 * @Description:
 */
public class Student {

    private String name;
    private String address;
    private int age;


    public Student(){}

    /**
     * 方式一: 通过构造器实现Di
     * @param name
     * @param address
     * @param age
     */
    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }


    public void setName1(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    /**
     * 使用setter方式来实现依赖注入
     * @return
     */



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }


}
