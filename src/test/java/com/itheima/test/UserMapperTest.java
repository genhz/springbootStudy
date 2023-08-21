package com.itheima.test;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest//springboot����ר��ע��
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    //int insert(T entity);// ����һ����¼
    @Test
    public void testSave() {
        User user = new User();
        user.setName("С��೤");
        user.setAge(18);
        user.setPassword("123456");
        user.setTel("13700137000");

        userMapper.insert(user);
    }


    //T selectById(Serializable id);// ������ѯ
    @Test
    public void testSelectById() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    //List<T> selectBatchIds(Collection idList); // ����������ѯ
    @Test
    public void testSelectByIds() {
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        ids.add(3L);
        List<User> userList = userMapper.selectBatchIds(ids);
        userList.forEach(e -> System.out.println(e));
    }

    //int updateById(T entity);// ID�޸�
    @Test
    public void testUpdateById(){
        User user = new User();
        user.setName("С��೤");
        user.setAge(18);
        user.setPassword("123456");
        user.setTel("13700137000");
        user.setId(1L);//ǧ��Ҫ����id
        userMapper.updateById(user);
    }

    //int deleteById(Serializable id); // IDɾ��
    @Test
    public void testDeleteById(){
        userMapper.deleteById(1L);
    }

    //int deleteBatchIds(Collection idList);// ID����ɾ��
    @Test
    public void testDeleteByIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(2L);
        ids.add(3L);
        userMapper.deleteBatchIds(ids);
    }
}