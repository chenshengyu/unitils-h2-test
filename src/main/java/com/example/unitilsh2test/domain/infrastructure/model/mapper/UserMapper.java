package com.example.unitilsh2test.domain.infrastructure.model.mapper;


import com.example.unitilsh2test.domain.infrastructure.entity.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户 mapper
 *
 * @author chensy
 * @since 2017/6/23.
 */
public interface UserMapper {

    /**
     * 用过名字查询user
     *
     * @param name 名字
     * @return user
     */
    @Select("select * from User where username = #{name}")
    User findByName(@Param("name") String name);
}
