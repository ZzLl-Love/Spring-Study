package cn.zyy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Zz
 * @Date: 2023/11/10/16:16
 * @Description: 致敬
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;

    private String name;

    private int age;

    /**
     * 学生对应班级号
     */
    private int class_id;

}
