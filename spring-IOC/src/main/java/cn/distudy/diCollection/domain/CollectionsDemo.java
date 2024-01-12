package cn.distudy.diCollection.domain;

import java.util.*;

/**
 * @Author: Zz
 * @Date: 2023/11/06/19:54
 * @Description: 致敬
 */
public class CollectionsDemo {

    private List<Integer> list;
    private Map<String, String> map;
    private Set<String> set;
    private Properties properties;
    private int[] arr;


    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setAr(int[] arr) {
        this.arr = arr;
    }

    /**
     * 打印方法
     */
    public void print(){
        System.out.println("list:"+list);
        System.out.println("map:"+map);
        System.out.println("set:"+set);
        System.out.println("properties:"+properties);
        System.out.println("arr:"+ Arrays.toString(arr));
    }
}
