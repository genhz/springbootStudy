package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.User;
import org.apache.ibatis.annotations.Mapper;

//mybatisplus要求我们自己的Mapper继承一个BaseMapper<实体类>
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
