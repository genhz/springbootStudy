package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest//springboot测试专用注解
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    //int insert(T entity);// 插入一条记录
    @Test
    public void testSave() {
        User user = new User();
        user.setName("小马班长");
        user.setAge(18);
        user.setPassword("123456");
        user.setTel("13700137000");

        userMapper.insert(user);
    }


    //T selectById(Serializable id);// 主键查询
    @Test
    public void testSelectById() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    //List<T> selectBatchIds(Collection idList); // 主键批量查询
    @Test
    public void testSelectByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        List<User> userList = userMapper.selectBatchIds(ids);
        userList.forEach(e -> System.out.println(e));
    }

    //int updateById(T entity);// ID修改
    @Test
    public void testUpdateById(){
        User user = new User();
        user.setName("小马班长");
        user.setAge(18);
        user.setPassword("123456");
        user.setTel("13700137000");
        user.setId(1L);//千万不要忘记id
        userMapper.updateById(user);
    }

    //int deleteById(Serializable id); // ID删除
    @Test
    public void testDeleteById(){
        userMapper.deleteById(1L);
    }

    //int deleteBatchIds(Collection idList);// ID批量删除
    @Test
    public void testDeleteByIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(2L);
        ids.add(3L);
        userMapper.deleteBatchIds(ids);
    }
}