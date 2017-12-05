package com.example.unitilsh2test.domain.model;


import com.example.unitilsh2test.domain.infrastructure.entity.User;

/**
 * 用户 仓库
 *
 * @author chensy
 * @since 2017/6/23.
 */
public interface UserRepository {
    /**
     * 用过名字查询user
     *
     * @param name 名字
     * @return user
     */
    User findByName(String name);
}
