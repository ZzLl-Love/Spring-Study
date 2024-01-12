package cn.distudy.diConstructor.mapper;

/**
 * @Author: Zz
 * @Date: 2023/11/06/17:50
 * @Description: 致敬
 */
public class UserMapperImpl implements UserMapper{

    @Override
    public void delete(Long id) {

        System.out.println("删除用户，id为：" + id);
    }
}
